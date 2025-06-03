//PseudoCode for Mystery Game with loops 3

//Generate random numbers between 1 - 10
//Ask the user to predict a number between  1 - 10 that the computer might have suggested.
//Double check each user prediction against what the computer predicted. (Give the user endless trials).
	//For every three wrong guesses the app should generate new random numbers. (Inform the users about the change everytime it changes).
	//if user prediction is higher than the computer prediction, print out a statement about it. (Count the losses for every wrong guess).
	//if user prediction is lower than the computer prediction, print out a statement about it. (Count the losses for every wrong guess)..
	//if user prediction is equal to or exactly what the computer predicted, print out a congratulatory statement about it. Then display the number of trials.

import java.util.Scanner;
public class MysteryGamePro3 {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	int computerRandom = (int) (Math.random () * 10 + 1);
		System.out.println("Computer guess for testing: " + computerRandom);

 	System.out.print("You have an endless try to enter a guess between 1 - 10. Enter a guess: ");
	int userGuess = keyboardInput.nextInt();

	int trialsCounter = 0;

	while (userGuess != computerRandom) {
	if (userGuess > computerRandom) System.out.println("Oops you guessed too high");
	if (userGuess < computerRandom) System.out.println("Oops you guessed too low");

	if (computerRandom = (int) (Math.random () * 10 + 1);
	if (userGuess > computerRandom) ++trialsCounter;
	if (userGuess < computerRandom) ++trialsCounter;

	System.out.print("Enter another guess: ");
	userGuess = keyboardInput.nextInt();
	if (userGuess == computerRandom) ++trialsCounter;
	if (userGuess == computerRandom) System.out.printf("Congratulations! You guessed %d times", trialsCounter); 
	}

	}
}