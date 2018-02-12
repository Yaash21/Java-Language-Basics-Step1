package org.stackroute;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		if (scan.hasNextInt()) {
			System.out.println("Invalid Input");
		} else if (scan.hasNextFloat()) {
			System.out.println("Invalid Input");
		} else if (scan.hasNextDouble()) {
			System.out.println("Invalid Input");
		} else {
			String s = scan.nextLine();
			int i = 0;
			for (i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					System.out.println(c + " - vowel");
				} else if (!Character.isLetter(c)) {
					System.out.println(c + " Invalid Input");
				} else {
					System.out.println(c + " - consonant");
				}
			}
		}
		scan.close();
	}
}
