import java.util.Scanner;
public class TestFile { 
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
		System.out.print("Enter a number to check if it is an Even number: ");
		int number = keyboardInput.nextInt();

		boolean k = Kata.isEven(number);

		System.out.print("It is "+ k + " that the number you entered is an even number");


	}

}