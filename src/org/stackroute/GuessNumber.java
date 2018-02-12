
package org.stackroute;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	int theNumber;
	int max = 100;
	Scanner scanner = new Scanner(System.in);

	public void GuessTheNumber() {
		Random rand = new Random();
		theNumber = Math.abs(rand.nextInt()) % (max + 1);

	}

	public void play() {
		while (true) {
			int move = scanner.nextInt();
			if (move > theNumber) {
				System.out.println("Your Number is too big");
			} else if (move < theNumber) {
				System.out.println("Your Number is too small");

			} else {
				System.out.println("YOU GOT IT BRO!!");
				break;
			}
		}
	}

	public static void main(String[] args) {
		GuessNumber guess = new GuessNumber();
		System.out.println("Welcome to Guess the Number Game.Try and guess!!" + "A small HINT: It is between 0 and "
				+ guess.max + "(both inclusive) " + "Just Type the number to get Started. All the best!!");
		guess.GuessTheNumber();
		guess.play();

	}
}
