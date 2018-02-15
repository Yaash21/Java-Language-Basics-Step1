package org.stackroute1;

//import java.util.Scanner;

public class Palindrome {

	public String reverse(String str) {
		String[] arr = str.split("");
		String after = "";
		int i = 0;
		int k = 0;
		int flag = 0;
		for (k = 0; k < arr.length; k++) {
			if ((arr[k].charAt(0) >= 32 && arr[k].charAt(0) <= 47) || (arr[k].charAt(0) >= 58 && arr[k].charAt(0) <= 64)
					|| (arr[k].charAt(0) >= 91 && arr[k].charAt(0) <= 96)
					|| (arr[k].charAt(0) >= 123 && arr[k].charAt(0) <= 127)) {
				after = "";
				flag = 1;
			}
		}
		if (flag == 0) {
			for (i = arr.length - 1; i >= 0; i--) {
				after += arr[i];
			}

		}
		return after;
	}

	public boolean validInput(String str) {
		String reversed = reverse(str);
		if (reversed.equals("")) {
			System.out.println("Invalid Input.Try agin avoiding special characters");
			return false;
		} else {
			return true;
		}

	}

	public boolean checkPalindrome(String str) {
		String reversed = reverse(str);
		if (str.equals(reversed)) {
			System.out.println(reversed);
			System.out.println("Its a palindrome");
			return true;
		} else {
			System.out.println(reversed);
			System.out.println("It is not a palindrome");
			return false;
		}
	}
}
