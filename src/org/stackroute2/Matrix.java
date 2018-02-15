package org.stackroute2;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the rows for matrix  :");
		int row = Integer.parseInt(scan.nextLine());
		System.out.println("Enter the columns for matrix  :");
		int col = Integer.parseInt(scan.nextLine());
		int matrixA[][] = new int[row][col];
		int matrixB[][] = new int[row][col];
		int sumMatrix[][] = new int[row][col];

		System.out.println("Input the number of first Matrix :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrixA[i][j] = scan.nextInt();

			}
		}
		System.out.println("Input the number of second Matrix :");
		for (int m = 0; m < row; m++) {
			for (int n = 0; n < col; n++) {
				matrixB[m][n] = scan.nextInt();
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		System.out.println("The Sum of Matrices:-");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(sumMatrix[i][j]);
			}
			System.out.println();
		}
		scan.close();
	}
}
