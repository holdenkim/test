package com.kosta.test;
import com.kosta.PlusMinus;

import junit.framework.*;



public class CalcTest extends TestCase {
	
	public void testPlus(){
		int result;
		result = PlusMinus.plus(4, 5);
		assertEquals(result, 9);
	}

	
	public void testMinus(){
		int result;
		result = PlusMinus.minus(9, 5);
		assertEquals(result, 4);
	}
}
