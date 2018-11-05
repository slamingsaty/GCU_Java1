
//created 2018-10-26 by Samuel Tschappler without any outside help

import java.util.Random;
import java.util.Scanner;

public class guessingGame {
	static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random randomNumber = new Random();
		int numberToGuess = randomNumber.nextInt(10000);
		int numberOfTries = 0;
		int guess = 0;
		int lastGuessHigher = 10000;
		int lastGuessLower = 1;
		int doneFlag = 0;

		while (doneFlag < 1) {
			System.out.println("Enter a guess between " + lastGuessLower + " and " + lastGuessHigher + ":");
			numberOfTries += 1;
			guess = scanner.nextInt();

			if (guess < 1 || guess > 10000) {
				System.out.println("A valid guess has to be between 1 and 10000.");
			}

			if (guess == numberToGuess) {
				System.out.println("You WIN! It took you " + numberOfTries + " guesses.");
				doneFlag = 1;
				break;
			}

			else if (guess > numberToGuess) {
				System.out.println("LOWER");
				lastGuessHigher = guess;
			} else if (guess < numberToGuess) {
				System.out.println("HIGHER");
				lastGuessLower = guess;
			}
		}
		scanner.close();
	}

}
