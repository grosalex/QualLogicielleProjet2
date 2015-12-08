
public class Hanoi {
	private BoundedStack[] slots; 
	
	public Hanoi(int number){
		slots= new BoundedStack[3];
		for (int i=0;i<3;i++){
			slots[i] = new BoundedStack(number);
			
		}
		for(int i =number;i<0;i--)
		slots[0].push(i);
	}
	
	public void moveADisk(int from, int to){
		if(slots[to].head()>slots[from].head()){
			slots[to].push(slots[from].head());
			slots[from].pop();
		}
	}


}
