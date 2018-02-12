package org.stackroute;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Assignment7 {

	public static String[] sort(String a) {
		String[] arr = a.split("");
		Arrays.sort(arr, Collections.reverseOrder());
		return arr;

	}

	public static int sum(String[] s) {
		int i = 0;
		int sum = 0;
		for (i = 0; i < s.length; i++) {
			if (i % 2 != 0) {
				sum += Integer.parseInt(s[i]);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String s[] = sort(a);
		String str = "";
		for (String i : s) {
			str += i;
		}
		System.out.println(str);
		System.out.println("Is the sum of all even elemnet is greater than 15 ?");
		if (sum(s) > 15) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		scan.close();

	}

}
