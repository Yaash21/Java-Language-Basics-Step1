package org.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment {

	public static void separate(String s) {
		String[] arr = s.split(" ");
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void fileName(String s) {
		String[] arr = s.split(" ");
		int i = Arrays.asList(arr).indexOf("from");
		System.out.println(arr[i + 1]);
	}

	public static void beforeWord(String s) {
		String[] arr = s.split(" ");
		int i = Arrays.asList(arr).indexOf("where");
		int k = 0;
		String sp = " ";
		String before = "";
		for (k = 0; k < i; k++) {
			before += arr[k] + sp;
		}
		System.out.println(before);
	}

	public static void afterWord(String s) {
		String[] arr = s.split(" ");
		int i = Arrays.asList(arr).indexOf("where");
		int j = Arrays.asList(arr).indexOf("order");
		int l = Arrays.asList(arr).indexOf("group");
		String sp = " ";
		String after = "";
		if (j > l) {
			int k = 0;

			for (k = i + 1; k < l; k++) {
				after += arr[k] + sp;
			}
		} else {
			int k = 0;
			for (k = i + 1; k < j; k++) {
				after += arr[k] + sp;
			}
		}
		System.out.println(after);
	}

	public static void condition(String s) {
		String[] arr = s.split(" ");
		int k = 0;
		String sp = " ";
		int z = 1;
		for (k = 0; k < arr.length; k++) {
			String c = arr[k].toString();
			char ch = c.charAt(0);
			if (ch >= 60 && ch <= 62) {
				System.out.println("Condition " + z++ + " : " + arr[k - 1] + sp + arr[k] + sp + arr[k + 1]);
			}

		}
	}

	public static void condition1(String s) {
		String[] arr = s.split(" ");
		int k = 0;
		String sp = " ";
		int z = 1;
		for (k = 0; k < arr.length; k++) {
			String c = arr[k].toString();
			char ch = c.charAt(0);
			if ((ch >= 60 && ch <= 62) || (ch == 33)) {
				System.out.println("Condition " + sp + z++ + " :");
				System.out.println();
				System.out.println("variable : " + arr[k - 1]);
				System.out.println("operator : " + arr[k]);
				System.out.println("value : " + arr[k + 1]);
				System.out.println();
			}
		}
	}

	public static void operator(String s) {
		String[] arr = s.split(" ");
		int k = 0;
		int z = 1;
		for (k = 0; k < arr.length; k++) {
			String c = arr[k].toString();
			if (c.equals("and") || c.equals("or") || c.equals("not")) {
				System.out.println("operator " + z++ + " : " + arr[k]);
			}

		}
	}

	public static void field(String s) {
		String[] arr = s.split(" ");
		int i = Arrays.asList(arr).indexOf("select");
		int f = Arrays.asList(arr).indexOf("from");
		int k = 0;
		String sp = " ";
		String after = "";
		for (k = i + 1; k < f; k++) {
			after += arr[k] + sp;
		}
		System.out.println(after);
	}

	public static void order(String s) {
		String[] arr = s.split(" ");
		int i = Arrays.asList(arr).indexOf("order");
		String after = arr[i + 2].toString();
		System.out.println(after);
	}

	public static void group(String s) {
		String[] arr = s.split(" ");
		int i = Arrays.asList(arr).indexOf("group");
		String after = arr[i + 2].toString();
		System.out.println(after);
	}

	public static void aggregate(String s) {
		String[] arr = s.split(" ");
		int k = 0;
		int z = 1;
		String agg = "";
		String after = "";
		for (k = 0; k < arr.length; k++) {
			String c = arr[k].toString();
			if (c.contains("(")) {
				int j = 0;
				int n = 0;
				int a = c.indexOf("(");
				int b = c.indexOf(")");
				for (j = 0; j < a; j++) {
					agg += c.charAt(j);
				}
				for (n = a + 1; n < b; n++) {
					after += c.charAt(n);
				}
				System.out.println("Aggregate " + z++);
				System.out.println();
				System.out.println("Aggregate Name : " + agg);
				System.out.println("Aggregate Field : " + after);
				System.out.println();
				agg = "";
				after = "";

			}

		}
	}

	public static void main(String[] args) {
		String s = "select avg(win_by_wickets), min(win_by_runs) from ipl.csv where season > 2014 and city = 'Bangalore' or date > '31-12-2014' order by season group by team";
		System.out.println(s);
		System.out.println();
		System.out.println("To split the input into words : Press 1 ");
		System.out.println();
		System.out.println("To Get the file name : Press 2 ");
		System.out.println();
		System.out.println("To Get the base part : Press 3 ");
		System.out.println();
		System.out.println("To Get the filter part : Press 4 ");
		System.out.println();
		System.out.println("To Get the conditions part : Press 5 ");
		System.out.println();
		System.out.println("To Get the conditions part into variable and value : Press 6 ");
		System.out.println();
		System.out.println("To Get the logical operators : Press 7 ");
		System.out.println();
		System.out.println("To Get the fields/information : Press 8 ");
		System.out.println();
		System.out.println("To Get the order by fields : Press 9 ");
		System.out.println();
		System.out.println("To Get the group by fields : Press 10 ");
		System.out.println();
		System.out.println("To Get the aggregate function : Press 11 ");
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {
			int a = scan.nextInt();
			switch (a) {
			case 1:
				separate(s);
				break;
			case 2:
				fileName(s);
				break;
			case 3:
				beforeWord(s);
				break;
			case 4:
				afterWord(s);
				break;
			case 5:
				condition(s);
				break;
			case 6:
				condition1(s);
				break;
			case 7:
				operator(s);
				break;
			case 8:
				field(s);
				break;
			case 9:
				order(s);
				break;
			case 10:
				group(s);
				break;
			case 11:
				aggregate(s);
				break;
			}
		}
		scan.close();

	}

}
