package org.stackroute1.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.stackroute1.LongFactorial;

public class LongFactorialTest {

	LongFactorial test;

	@Before
	public void initialize() {
		test = new LongFactorial();
	}

	@Test
	public void testForValidArguement() {
		// arrange
		String str = "s&b";
		String expected = "Invalid Input:Enter Numbers Only";
		String message = "Error:Taking non-digit input";
		// act
		String actual = test.factorial(str);
		// assert
		assertEquals(message, expected, actual);
	}

	@Test
	public void testForInteger() {
		// arrange
		String str = "1.5";
		String expected = "Invalid Input:No Fractions Allowed";
		String message = "Error:Taking non-integer input";
		// act
		String actual = test.factorial(str);
		// assert
		assertEquals(message, expected, actual);
	}

	@Test
	public void testForFactorialInLongRange() {
		String str = "19";
		String expected = "121645100408832000";
		String message = "Error:Taking non-integer input";
		// act
		String actual = test.factorial(str);
		// assert
		assertEquals(message, expected, actual);
	}

	@Test
	public void testForFactorialOutOfLongRange() {
		String str = "25";
		String expected = "Out of Range";
		String message = "Error:Should Return Out of Range";
		// act
		String actual = test.factorial(str);
		// assert
		assertEquals(message, expected, actual);
	}

	@Test
	public void testForZero() {
		String str = "0";
		String expected = "1";
		String message = "Error:Zero Factorial is 1";
		// act
		String actual = test.factorial(str);
		// assert
		assertEquals(message, expected, actual);
	}

	@After
	public void terminate() {
		test = null;
	}

}
