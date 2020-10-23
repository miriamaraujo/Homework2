package question3;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userInput = -1;
		double finalScore;
		boolean validInput = false;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Please enter a mark between 0 and 100");
			userInput = sc.nextInt();

			if ((userInput >= 0) && (userInput <= 100)) {
				validInput = true;
			} else {
				System.out.println("Invalid input");
				sc.nextLine();

				validInput = false;
			}

		} while (!validInput);
		finalScore = userInput * 0.2;

		if (finalScore <= 10.0) {

			System.out.println("Your score is " + finalScore + "%. You're not there yet but keep swimming! ");
		} else {
			System.out.println("Your score is " + finalScore + "%. You're nailing it!");
		}

	}

}
