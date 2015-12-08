
public class Hanoi {
	private BoundedStack[] slots; 
	
	public Hanoi(int number){
		slots= new BoundedStack[3];
		for (int i=0;i<3;i++){
			slots[i] = new BoundedStack(number);
			
		}

		for(int i =number;i>0;i--){
			try {
				slots[0].push(i);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void moveADisk(int from, int to){
		try {
			if( ( slots[to].getNumberOfElements()== 0 ||slots[to].head()>slots[from].head() )
					&& to>=0 && to<=3 
					&& from>=0 && from<=3 
					&& !slots[from].isEmpty()){
//			System.out.println("Moving disc"+slots[to].head()+" from tower "+to+" into tower "+from + " with disc " + slots[from].hashCode() + "on top.");
				slots[to].push(slots[from].head());
				slots[from].pop();			
			}
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public BoundedStack[] getSlots(){
		return slots;
	}

}
