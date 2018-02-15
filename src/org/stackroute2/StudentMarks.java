package org.stackroute2;

import java.util.Scanner;

public class StudentMarks {

	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("Enter the number of students : ");
		scanner = new Scanner(System.in);
		int numOfStudents = scanner.nextInt();
		Integer[] stuGrades = new Integer[numOfStudents];
		for (int i = 0; i < numOfStudents; i++) {
			System.out.println("Enter the grade of Student" + (i + 1) + " : ");
			int a = scanner.nextInt();
			if (a >= 0 && a <= 100) {
				stuGrades[i] = a;
			} else {
				throw new ArithmeticException("Error: Enter a number between " + "0 and 100");
			}
		}
		scanner.close();
	}

}
