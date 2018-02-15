package org.stackroute1;

import java.util.Scanner;

public class StudentGrade {
	// int numberOfStudents;
	// int grades;
	//
	// public Students(int i, int g) {
	// this.numberOfStudents = i;
	// this.grades = g;
	// }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Students : ");
		int numberOfStudents = scan.nextInt();
		String[] arr = new String[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter the grade for student" + (i + 1) + ": ");
			arr[i] = scan.nextLine();
		}
		scan.close();
		System.out.println("The average is " + average(arr));
		System.out.println("The maximum Grade is " + maximum(arr));
		System.out.println("The minimum Grade is " + minimum(arr));

	}

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

	public static double average(String[] arr) {
		double sum = 0;
		for (int k = 0; k < arr.length; k++) {
			sum += Double.parseDouble(arr[k]);
		}
		double avg = sum / arr.length;
		return avg;
	}

	public static int maximum(String[] arr) {
		int max = 0;
		for (int k = 0; k < arr.length; k++) {

			max = Math.max(Integer.parseInt(arr[k]), max);
		}
		return max;
	}

	public static int minimum(String[] arr) {
		int min = Integer.MAX_VALUE;
		for (int k = 0; k < arr.length; k++) {

			min = Math.min(Integer.parseInt(arr[k]), min);
		}
		return min;
	}
}
