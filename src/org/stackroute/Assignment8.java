package org.stackroute;

import java.util.Random;
import java.util.Scanner;

public class Assignment8 {

	int theNumber;
	static int max = 100;
	static Scanner scanner = new Scanner(System.in);

	public static void GuessTheNumber() {
		Random rand = new Random();
		int theNumber = Math.abs(rand.nextInt()) % (max + 1);

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
		scanner.close();
	}

}
