
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
		try {
			stack.push(x);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}
	
	public int head () {
		return stack.getArrayElement(0);
	}
	
	public void pop () {
		while(!stack.isEmpty()) {
			int val;
			try {
				val = stack.head();
				stack.pop();
				tmp.push(val);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			}
		}
		
		try {
			tmp.pop();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		
		while(!tmp.isEmpty()) {
			int val;
			try {
				val = tmp.head();
				tmp.pop();
				stack.push(val);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			}
			
		}
	}
}
