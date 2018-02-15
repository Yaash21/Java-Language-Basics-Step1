package org.stackroute1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EvenNumTest {

	@Test
	public void integerTest() {
		// arrange
		String s = "abc";

		// act
		boolean res = EvenNum.isInteger(s);
		// assert
		assertFalse(res);
	}

	@Test
	public void EvenTest() {
		// arrange
		String s1 = "24";
		String s2 = "125";

		// act
		boolean res = EvenNum.isEven(s1);
		boolean res1 = EvenNum.isEven(s2);
		// assert
		assertTrue(res);
		assertFalse(res1);
	}
}
