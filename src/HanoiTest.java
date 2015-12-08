import static org.junit.Assert.*;

import org.junit.Test;

public class HanoiTest {
	private Hanoi toTest = new Hanoi(3);
	@Test
	public void testHanoi() {
		Hanoi toT =  new Hanoi(5);
		assertNotNull(toT);
	}

	@Test
	public void testMoveADisk() {
		//fail("Not yet implemented");
		Hanoi toT =  new Hanoi(3);
		BoundedStack[] result = toT.getSlots();
		int tmp1;
		try {
			tmp1 = result[0].head();
			result[0].pop();
			int tmp2 = result[0].head();
			toT.moveADisk(0,1);
			assertEquals(tmp2,toT.getSlots()[0].head());
			assertEquals(tmp1,result[1].head());
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		
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
