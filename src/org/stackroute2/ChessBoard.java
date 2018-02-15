package org.stackroute2;

public class ChessBoard {
	public static void main(String[] args) {
		String chess[][] = new String[8][8];
		for (int m = 0; m < 8; m++) {
			for (int n = 0; n < 8; n++) {
				if ((m + n) % 2 == 0) {
					chess[m][n] = "WW|";
				} else {
					chess[m][n] = "BB|";
				}
			}
		}
		System.out.println("MyChessBoard");
		System.out.println();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(chess[i][j]);
			}
			System.out.println();
		}
	}

}
