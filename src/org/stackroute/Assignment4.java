package org.stackroute;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give a Number");
		int a = scan.nextInt();
		int i = 0;
		int j = 0;
		for (i = 0; i < (a + 1); i++) {
			for (j = 0; j < i; j++) {
				System.out.print(i);
			}

		}
		scan.close();
	}

}
