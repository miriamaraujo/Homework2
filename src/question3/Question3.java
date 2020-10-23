/**
 * @author MiriamAraujo
 * 2019430
 * HDIP
 */

package question3;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);// Creates new scanner
		int userInput = 0; // The value of the marks to be defined by the user.
		double ohHiMarks; // here is going to be stored the final result of the calculation and print it
							// as decimal
		boolean isItValid = false; // checks if the input is valid or not

//        if input valid and within 100, do the math "result = user input * 0.2" 
//        if under 50% show fail message else show success

		do {

			try {
				System.out.println("Please enter a mark between 0 and 100");
				userInput = sc.nextInt();

				if ((userInput >= 0) && (userInput <= 100)) {
					isItValid = true;
				}

			} catch (Exception e) {
				System.out.println("Invalid input, try again with numbers");
				sc.nextLine();

				isItValid = false;
			}

		} while (!isItValid);

		// input must be valid

		ohHiMarks = userInput * 0.2;

		if (ohHiMarks <= 10.0) {

			System.out.println("Your score is " + ohHiMarks + "%. You're not there yet but keep swimming!");
		} else {
			System.out.println("Your score is " + ohHiMarks + "%. You're nailing it!");
		}

	}

}

// I followed the code you posted on moodle and just added one more condition at the and that prints how the user
//is doing. 
// The Do loop executes first the function that collects and stores the user input. While it is a number according
// to the tryCatch block it will move on to the next block which executes the math and store the result into the 
// Double variable that is checked in the If Else block.
