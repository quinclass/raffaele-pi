package it.quin.secondweek.ex2509;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VectorTest {

	private Vector v;
	
	@Before
	public void setUp() {
		v = new Vector();
	}
		
	
	@Test
	public void testConstructor() {
		assertEquals(0, v.size());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetOutofBound() {
		v.get(Integer.MAX_VALUE);
		fail("");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetNegativeBound() {
		v.get(-1);
		fail("");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetUnvalidZero() {
		v.get(0);
		fail("");
	}
	
	
	@Test
	public void testGetCorrection() {
		v.add(4);
		assertEquals(4,v.get(0));
		assertEquals(1,v.size());
		v.add(5);
		assertEquals(4,v.get(0));
		assertEquals(5,v.get(1));
		assertEquals(2,v.size());
	}
	
}
