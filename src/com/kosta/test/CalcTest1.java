package com.kosta.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kosta.MultiDiv;
import com.kosta.PlusMinus;

public class CalcTest1 {

	@Test
	public void testPlus() {
		// fail("Not yet implemented");
		int result;
		result = PlusMinus.plus(4, 5);
		assertEquals(result, 9);
	}
	
	@Test
	public void testMinus() {
		// fail("Not yet implemented");
		int result;
		result = PlusMinus.minus(9, 5);
		assertEquals(result, 4);
	}
	
	
	
	
	@Test
	public void testMilti() {
		// fail("Not yet implemented");
		
		assertEquals(45, MultiDiv.multi(9, 5));
	}
	
	
	@Test
	public void testDiv() {
		// fail("Not yet implemented");
		int result;
		result = MultiDiv.div(45, 5);
		assertEquals(result, 9);
	}
	
	@Test
	public void testDivDouble() {
		// fail("Not yet implemented");
		
	assertTrue(MultiDiv.div(10.5, 10.5) == 2);
	}

}
