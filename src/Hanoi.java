
public class Hanoi {
	private BoundedStack[] slots; 
	
	public Hanoi(int number){
		slots= new BoundedStack[number];
		for (int i=0;i<number;i++){
			slots[i] = new BoundedStack(number);
		}
	}
	
	public void moveADisk(int from, int to){
		if(slots[to].head()>slots[from].head()){
			slots[to].push(slots[from].head());
			slots[from].pop();
		}
	}

}
