
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
	
	public boolean moveADisk(int from, int to){
		try{
			if( ( slots[to].getNumberOfElements()== 0 ||slots[to].head()>slots[from].head() )
					&& to>=0 && to<=3 
					&& from>=0 && from<=3 
					&& !slots[from].isEmpty()){
	//			System.out.println("Moving disc"+slots[to].head()+" from tower "+to+" into tower "+from + " with disc " + slots[from].hashCode() + "on top.");
				slots[to].push(slots[from].head());
				slots[from].pop();			
				print();
				return true;
			}
		}catch(IllegalStateException e){
			e.printStackTrace();
		}
		return false;
	}
	public BoundedStack[] getSlots(){
		return slots;
	}
	
	public void print () {
		for (int i = 0; i < slots.length; i++) {
			printATower(i);
			
		}System.out.println();
	}
	
	public void printATower(int index) {
		System.out.print("Etat de la tour numéro "+index+": ");
		if(slots[index].isEmpty()) System.out.print("vide");
		else {
			for (int i = 0; i < slots[index].getNumberOfElements(); i++) {
				System.out.print(slots[index].getArrayElement(i) + " ");
			}
		}
		System.out.println();

	}

}
