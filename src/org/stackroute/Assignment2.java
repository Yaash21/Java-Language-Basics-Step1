package org.stackroute;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if (a % 2 == 0 && a > 20 && a < 30) {
			System.out.println("Jerry");

		} else if (a % 2 == 1 && a > 20 && a < 30) {
			System.out.println("Tom");
		} else {
			System.out.println("Please run the Programme again with input between 20 and 30 .");
		}
		scan.close();
	}

}
