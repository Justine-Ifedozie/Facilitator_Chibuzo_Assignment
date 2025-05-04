import java.util.Scanner;
public class TestFile9 { 
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
		System.out.print("Enter an integer: ");
		int number1 = keyboardInput.nextInt();

		long  k = Kata.SquareInteger(number1);

		System.out.print("The square of the number you entered is: " + k); 

	}



}