package org.stackroute1;

//import java.util.Scanner;

public class LongFactorial {

	// public static void main(String[] args) {
	// Scanner scan = new Scanner(System.in);
	// System.out.println("Enter the number: ");
	// String input = scan.nextLine();
	// if (factorial(input) > 2147483647) {
	// System.out.println("The factorial of " + input + " is out of range");
	// } else {
	// System.out.println("The factorial of " + input + " is " +
	// factorial(input));
	// }
	// scan.close();
	//
	// }

	public static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
		return true;
	}

	public static String factorial(String input) {
		if (isInteger(input) == false) {
			String s = "Invalid Input:Enter Numbers Only";
			return s;
		} else {
			long i = Long.parseLong(input);
			long factor = 1;
			if (i == 0) {
				return "1";

			} else {
				for (long k = 1; k <= i; k++) {
					factor = k * factor;
				}
				if (factor > 9223372036854775807l || factor < 0) {
					String out = "Out of Range";
					return out;
				} else {
					String fact = String.valueOf(factor);
					return fact;
				}
			}

		}
	}
}