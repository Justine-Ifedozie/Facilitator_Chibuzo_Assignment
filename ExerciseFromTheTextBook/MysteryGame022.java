import java.util.Scanner;
import java.util.Random;
public class MysteryGame022 {

	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	Random computerInput = new Random();

	int generatedNumber = computerInput.nextInt(10)+1;
	//System.out.println(generatedNumber);

	System.out.print("Enter a guess between number 1 to 10: ");
	int userGuess = keyboardInput.nextInt();
	
	if (generatedNumber > userGuess) {
	System.out.print("The number you chose is lesser. You have two trials left! Enter a number: ");
	userGuess = keyboardInput.nextInt();
	}

	else if (generatedNumber < userGuess) {
	System.out.print("The number you chose is higher. You have two trials left! Enter a number: ");
	userGuess = keyboardInput.nextInt();
	}

	if (generatedNumber > userGuess) {
	System.out.print("The number you chose is lesser. You have one trial left! Enter a number: ");
	userGuess = keyboardInput.nextInt();
	}

	else if (generatedNumber < userGuess) {
	System.out.print("The number you chose is higher. You have one trial left! Enter a number: ");
	userGuess = keyboardInput.nextInt();
	}

	if (generatedNumber == userGuess) {
	System.out.print("You're correct!");
	}

	else {
	System.out.print("Oops you ran out of trials");
	}
	
	}
}