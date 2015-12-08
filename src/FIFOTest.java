import static org.junit.Assert.*;

import org.junit.Test;


public class FIFOTest {

	@Test
	public void testBoundedStack() {
		FIFO toT = new FIFO(10);
		assertNotNull(toT);
	}

	@Test
	public void testGetSize() {
		int size = 10;
		FIFO toT = new FIFO(size);
		assertEquals(size,toT.getSize());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetNumberOfElements() {
		FIFO toT = new FIFO(10);
		assertEquals(0,toT.getNumberOfElements());
		toT.push(1);
		assertEquals(1,toT.getNumberOfElements());
		toT.push(2);
		assertEquals(2,toT.getNumberOfElements());
		toT.pop();
		assertEquals(1,toT.getNumberOfElements());

	}

	@Test
	public void testIsFull() {
		FIFO toT= new FIFO(3);
		assertFalse(toT.isFull());
		toT.push(20);
		assertFalse(toT.isFull());
		toT.push(20);
		assertFalse(toT.isFull());
		toT.push(20);
		assertTrue(toT.isFull());
	}

	@Test
	public void testIsEmpty() {
		FIFO toT= new FIFO(3);
		assertTrue(toT.isEmpty());
		toT.push(20);
		assertFalse(toT.isEmpty());
	}

	@Test
	public void testPush() {
		FIFO toT = new FIFO(10);
		toT.push(20);
		assertEquals(toT.head(), 20);
		toT.push(30);
		assertEquals(toT.head(), 20);

	}

	@Test
	public void testHead() {
		FIFO toT = new FIFO(10);
		toT.push(20);
		assertEquals(toT.head(), 20);
	}

	@Test
	public void testPop() {
		FIFO toT = new FIFO(10);
		toT.push(20);
		assertEquals(toT.head(), 20);
		toT.push(30);
		assertEquals(toT.head(), 20);
		toT.pop();
		assertEquals(toT.head(), 30);

	}

}
