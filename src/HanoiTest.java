import static org.junit.Assert.*;

import org.junit.Test;

public class HanoiTest {

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
	public void move(Hanoi in,int number, int from, int to, int via){
		if(number>0){
			move(in,number-1,from,via,to);
			in.moveADisk(from, to);
			move(in,number-1,via,to,from);
		}
	}

}
