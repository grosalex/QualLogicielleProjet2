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
		try {
			toT.push(1);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		assertEquals(1,toT.getNumberOfElements());
		try {
			toT.push(2);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		assertEquals(2,toT.getNumberOfElements());
		try {
			toT.pop();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		assertEquals(1,toT.getNumberOfElements());

	}

	@Test
	public void testIsFull() {
		BoundedStack toT= new BoundedStack(3);
		assertFalse(toT.isFull());
		try {
			toT.push(20);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		assertFalse(toT.isFull());
		try {
			toT.push(20);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		assertFalse(toT.isFull());
		try {
			toT.push(20);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		assertTrue(toT.isFull());
	}

	@Test
	public void testIsEmpty() {
		BoundedStack toT= new BoundedStack(3);
		assertTrue(toT.isEmpty());
		try {
			toT.push(20);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		assertFalse(toT.isEmpty());
	}

	@Test
	public void testPush() {
		BoundedStack toT = new BoundedStack(10);
		try {
			toT.push(20);
			assertEquals(toT.head(), 20);
			toT.push(30);
			assertEquals(toT.head(), 30);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testHead() {
		BoundedStack toT = new BoundedStack(10);
		try {
			toT.push(20);
			assertEquals(toT.head(), 20);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testPop() {
		BoundedStack toT = new BoundedStack(10);
		try {
			toT.push(20);
			assertEquals(toT.head(), 20);
			toT.push(30);
			assertEquals(toT.head(), 30);
			toT.pop();
			assertEquals(toT.head(), 20);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}

}
