package org.stackroute;

import java.util.Scanner;

public class Assignment9 {

	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("Give a string as Input:");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(reverse(s));
		scan.close();

	}
}
