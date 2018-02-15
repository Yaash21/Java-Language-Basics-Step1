package org.stackroute1;

public class EvenNum {

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
		return true;
	}

	public static boolean isEven(String s) {
		int number = Integer.parseInt(s);
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
