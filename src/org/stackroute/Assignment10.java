package org.stackroute;

import java.util.Scanner;

public class Assignment10 {

	public static String[] lastchar(String[] str, int a) {
		String[] arr = new String[a];
		int i;
		int k = 0;
		for (i = str.length - a; i <= str.length - 1; i++) {
			arr[k] = str[i];
			k++;
		}
		return arr;
	}

	public static String repeat(String[] str, int a) {
		int i = 0;
		String[] f1 = lastchar(str, a);
		String f = "";
		for (i = 0; i < f1.length; i++) {
			f += f1[i];
		}
		return f;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int a = scan.nextInt();
		String[] str = s.split("");
		System.out.print(s);
		int j = 0;
		for (j = 0; j < a; j++) {
			System.out.print(repeat(str, a));

		}

		scan.close();
	}
}
