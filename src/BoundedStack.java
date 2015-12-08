
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
		if(number<0 || number>getSize()) throw new IllegalStateException("Wrong Index");
		stack[number]=x;
		number++;
	}
	public int head() throws IllegalStateException{
		if(number<0 || number>getSize()) throw new IllegalStateException("Wrong Index");
		return stack[number-1];
	}
	public void pop() throws IllegalStateException{
		if(isEmpty()) throw new IllegalStateException("Empty stack");
		number--;
	}
	
	public int getArrayElement(int index) {
		return stack[index];
	}
}
