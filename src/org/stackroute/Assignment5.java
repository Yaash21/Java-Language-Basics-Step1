package org.stackroute;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while (scan.hasNext()) {
			if (scan.hasNextInt()) {
				int a = scan.nextInt();
				sum += a;
				System.out.println("The sum of all input is " + sum);
			} else if (scan.hasNextLine()) {
				System.out.println("Invalid Input");
				break;

			}

		}
		scan.close();
	}
}