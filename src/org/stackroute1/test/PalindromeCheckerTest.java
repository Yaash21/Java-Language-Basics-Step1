package org.stackroute1.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.stackroute1.Palindrome;

public class PalindromeCheckerTest {
	Palindrome obj;

	@Before
	public void setup() {
		obj = new Palindrome();
	}

	@After
	public void cleanup() {
		obj = null;
	}

	@Test
	public void checkNotPalindrome() {
		// arrange
		String str = "12345";
		// act
		boolean res = obj.checkPalindrome(str);
		// assert
		assertFalse(res);
	}

	@Test
	public void checkPalindrome() {
		// arrange
		String str = "abcba";
		// act
		boolean res = obj.checkPalindrome(str);
		// assert
		assertTrue(res);
	}

	@Test
	public void checkValidity() {
		// arrange
		String str = "123@4$";
		String str1 = "123abc";
		// act
		boolean res = obj.validInput(str);
		boolean res1 = obj.validInput(str1);
		// assert
		assertFalse(res);
		assertTrue(res1);
	}

	@Test
	public void reversibility() {
		// arrange
		String str = "abcb";
		String expected = "bcba";
		// act
		String res = obj.reverse(str);
		// assert
		assertEquals("does not match as expected", expected, res);
	}

}