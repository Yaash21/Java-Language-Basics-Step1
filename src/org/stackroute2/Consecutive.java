package org.stackroute2;

import java.util.Scanner;

public class Consecutive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] arr = input.split(",");
		int flag = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (Integer.parseInt(arr[i + 1]) - Integer.parseInt(arr[i]) == 1
					|| Integer.parseInt(arr[i + 1]) - Integer.parseInt(arr[i]) == -1) {
				flag = 0;
			} else {
				System.out.println(input + " are non consecutive numbers");
				flag = 1;
				break;

			}

		}
		if (flag == 0) {
			System.out.println(input + " are consecutive numbers");

		}
		scan.close();

	}

}
