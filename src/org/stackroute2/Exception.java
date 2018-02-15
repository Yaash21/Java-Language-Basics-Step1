package org.stackroute2;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Press E to Execute");
		System.out.println("Number of Elements to be Stored in array");
		int numOfElements = Integer.parseInt(scan.nextLine());
		System.out.println("Input the Element:");
		int flag = 0;
		String[] arr = new String[numOfElements];
		try {
			for (int n = 0; n < Integer.MAX_VALUE; n++) {
				if (scan.hasNext("E")) {
					flag = 0;
					break;
				} else {
					for (int i = 0; i < arr.length; i++) {
						if (scan.hasNext("E")) {
							flag = 0;
							break;
						} else {
							arr[i] = scan.nextLine();
							flag = 1;
						}
					}
				}

			}
		} catch (

		NegativeArraySizeException ex) {
			System.out.println("Can't create array of negative size");
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Can't create array of more than the size input");
		} catch (NullPointerException ex) {
			System.out.println("Can't create array with null value");
		}
		if (flag == 0) {
			for (int k = 0; k < arr.length; k++) {
				System.out.println(arr[k]);
			}
		}
		scan.close();

	}

}
