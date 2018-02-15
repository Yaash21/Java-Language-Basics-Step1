package org.stackroute1;

public class PowerOfFour {
	// private String s;
	//
	// public Exponent(String s) {
	// this.s = s;
	// }
	//
	// public static void main(String[] args) {
	// Scanner scan = new Scanner(System.in);
	// String input = scan.nextLine();
	// Exponent obj = new Exponent(input);
	//
	// if (obj.log() == 0) {
	// System.out.println("The given number is not a power of 4");
	// } else {
	// System.out.println("The given number is a power of 4 where exponent = " +
	// obj.log());
	// }
	// scan.close();
	// }

	public Integer log(String s) {
		double x = 4;
		int exp;
		double i = (Math.log(Double.parseDouble(s)) / Math.log(x));
		if (i == (int) i) {
			exp = (int) i;
			return exp;

		} else {
			return (Integer) null;
		}

	}

	public boolean checkForPowerOfFour(String s) {

		if (s == null) {
			throw new NullPointerException();
		}
		Integer.parseInt(s);
		if (log(s) == (Integer) null) {
			return false;
		} else {
			return true;
		}
	}

}
