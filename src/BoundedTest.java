import static org.junit.Assert.*;

import org.junit.Test;

public class BoundedTest {

	@Test
	public void testBoundedStack() {
		BoundedStack toT = new BoundedStack(10);
		assertNotNull(toT);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetSize() {
		int size = 10;
		BoundedStack toT = new BoundedStack(size);
		assertEquals(size,toT.getSize());
		
		//fail("Not yet implemented");
	}

	@Test
	public void testGetNumberOfElements() {
		BoundedStack toT = new BoundedStack(10);
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
		BoundedStack toT= new BoundedStack(3);
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
		BoundedStack toT= new BoundedStack(3);
		assertTrue(toT.isEmpty());
		toT.push(20);
		assertFalse(toT.isEmpty());
	}

	@Test
	public void testPush() {
		BoundedStack toT = new BoundedStack(10);
		toT.push(20);
		assertEquals(toT.head(), 20);
		toT.push(30);
		assertEquals(toT.head(), 30);

	}

	@Test
	public void testHead() {
		BoundedStack toT = new BoundedStack(10);
		toT.push(20);
		assertEquals(toT.head(), 20);
	}

	@Test
	public void testPop() {
		BoundedStack toT = new BoundedStack(10);
		toT.push(20);
		assertEquals(toT.head(), 20);
		toT.push(30);
		assertEquals(toT.head(), 30);
		toT.pop();
		assertEquals(toT.head(), 20);

	}

}
