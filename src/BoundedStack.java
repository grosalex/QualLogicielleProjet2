
public class BoundedStack {
	private int [] stack;
	private int number;
	public BoundedStack(int size){
		stack = new int[size];
		number=0;
		
	}
	public int getSize(){
		return stack.length;
	}
	public int getNumberOfElements(){
		return number;
	}
	public boolean isFull(){
		if(getSize()==number){
			return true;
		}else return false;
	}
	public boolean isEmpty(){
		if(number==0)return true;
		else return false;
	}
	
	public void push(int x) throws IllegalStateException{
		stack[number]=x;
		number++;
	}
	public int head() throws IllegalStateException{
		return stack[number-1];
	}
	public void pop() throws IllegalStateException{
		//stack[number]=;
		number--;
	}
}
