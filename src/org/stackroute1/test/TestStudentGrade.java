package org.stackroute1.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.stackroute1.StudentGrade;

public class TestStudentGrade {
	StudentGrade mark;

	@Before
	public void setup() {
		mark = new StudentGrade();
	}

	@After
	public void cleanup() {
		mark = null;
	}

	@Test
	public void testGrade() {

		String str1 = "abcd";

		boolean res = mark.isInteger(str1);
		assertFalse(res);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void checkOutputAvg() {
		String[] mark1 = { "12", "13", "14", "11", "10" };
		double avg1 = 12d;

		// double avg2=mark.average(mark1);
		boolean b = avg1 == mark.average(mark1);
		assertTrue("Wrong average", b);
	}

	@Test
	public void checkOutputMin() {
		String[] mark1 = { "12", "13", "14", "11", "10" };
		int min = 10;

		// int avg2=mark.average(mark1);

		assertEquals("Wrong average", min, mark.minimum(mark1));
	}

	@Test
	public void checkOutputMax() {
		String[] mark1 = { "12", "13", "14", "11", "10" };
		int max = 14;

		// int avg2=mark.average(mark1);

		assertEquals("Wrong average", max, mark.maximum(mark1));
	}

}
