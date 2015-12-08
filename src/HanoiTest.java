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
		Hanoi init = new Hanoi(3);
		
		try{
		assertTrue(toT.moveADisk(0,1));		
		assertEquals(init.getSlots()[0].head(),toT.getSlots()[1].head());
		//assertEquals(tmp1,toT.getSlots()[1].head());
		init.getSlots()[0].pop();
		assertEquals(init.getSlots()[0].head(), toT.getSlots()[0].head());
		}catch(IllegalStateException e){
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testAllHanoi(){
		toTest.print();
		move(3,0,2,1);
	}
	
	public void move(int number, int from, int to, int via){
		if(number>0){
			move(number-1,from,via,to);
			toTest.moveADisk(from, to);
			toTest.print();
			move(number-1,via,to,from);
		}
	}

}
