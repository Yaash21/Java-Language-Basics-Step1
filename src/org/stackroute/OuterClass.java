package org.stackroute;

import java.util.Scanner;

public class OuterClass {

	public static void main(String[] yaash) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Whats your Name?");
		while (scan.hasNextLine()) {
			String s = scan.nextLine();
			System.out.println("Hello " + s);
			System.out.println("g");
		}
		scan.close();

	}

}
