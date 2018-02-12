package org.stackroute;

import java.util.Scanner;

public class Assignment1 {

	public static String check(int a) {
		String s = Integer.toString(a);
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}

	public static int even(int a) {
		int sum = 0;
		for (; a > 0;) {
			int temp = a % 10;
			a /= 10;
			if (temp % 2 == 0) {
				sum += temp;
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Give a number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		String s = Integer.toString(a);
		if (s.equals(check(a)) && even(a) > 25) {
			System.out.println(a + " is a palindrome and the sum of even" + " numbers is greater than 25");
		} else if (s.equals(check(a)) && even(a) < 25) {
			System.out.println(a + " is a palindrome and the sum of even" + " numbers is less than 25");
		} else {
			System.out.println(a + "is not a palindrome");
		}

	}
}
