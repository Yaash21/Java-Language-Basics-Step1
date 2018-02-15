package org.stackroute2;

import java.util.Scanner;

public class Places {
	public static String[] noVowel(String[] a) {
		String noVow = "";
		for (int i = 0; i < a.length; i++) {
			String[] arr = a[i].split("");
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals("a") || arr[j].equals("e") || arr[j].equals("i") || arr[j].equals("o")
						|| arr[j].equals("u")) {
					arr[j] = "";
				} else {
					arr[j] = arr[j];
				}
				noVow += arr[j];

			}
			a[i] = noVow;
			noVow = "";

		}
		return a;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Places:");
		int i = Integer.parseInt(scan.nextLine());
		String[] places = new String[i];
		for (int n = 0; n < places.length; n++) {
			System.out.println("Enter the place " + (n + 1));
			places[n] = scan.nextLine();
		}
		String[] noVowels = noVowel(places);
		for (int m = 0; m < noVowels.length; m++) {
			System.out.println("Place Name without Vowels:" + (m + 1) + " " + noVowels[m]);
		}
		scan.close();

	}

}
