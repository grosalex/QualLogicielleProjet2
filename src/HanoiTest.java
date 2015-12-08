import static org.junit.Assert.*;

import org.junit.Test;

public class HanoiTest {
	private Hanoi toTest = new Hanoi(3);
	@Test
	public void testHanoi() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveADisk() {
		//fail("Not yet implemented");
	}
	public void testAllHanoi(){
		
	}
	
	public void move(int number, int from, int to, int via){
		
		if(number>0){
			move(number-1,from,via,to);
			toTest.moveADisk(from, to);
			move(number-1,via,to,from);
		}
	}

}
