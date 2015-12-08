
public class FIFO {
	private BoundedStack stack;
	private BoundedStack tmp;
	
	public FIFO(int size) {
		stack = new BoundedStack(size);
		tmp = new BoundedStack(size);
	}
	
	public int getSize(){
		return stack.getSize();
	}
	
	public int getNumberOfElements(){
		return stack.getNumberOfElements();
	}
	
	public boolean isFull() {
		return stack.isFull();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void push (int x) {
		stack.push(x);
	}
	
	public int head () {
		return stack.getArrayElement(0);
	}
	
	public void pop () {
		while(!stack.isEmpty()) {
			int val = stack.head();
			stack.pop();
			tmp.push(val);
		}
		tmp.pop();
		while(!tmp.isEmpty()) {
			int val = tmp.head();
			tmp.pop();
			stack.push(val);
		}
	}
}
