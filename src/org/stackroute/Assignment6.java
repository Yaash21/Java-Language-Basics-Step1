package org.stackroute;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		System.out.println("Give a Character");
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		if (c >= 65 && c <= 90) {
			System.out.println("Capital Letter");
		} else if (c >= 97 && c <= 122) {
			System.out.println("Small Case Letter");
		} else if (c >= 32 && c <= 64) {
			System.out.println("Special Character");
		} else {
			System.out.println("Digit");
		}

		scan.close();
	}

}
