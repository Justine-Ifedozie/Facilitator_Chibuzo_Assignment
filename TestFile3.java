import java.util.Scanner;
public class TestFile3 { 
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
		System.out.print("Enter first number: ");
		int number1 = keyboardInput.nextInt();

		System.out.print("Enter second number: ");
		int number2 = keyboardInput.nextInt();

		int k = Kata.Subtract(number1, number2);

		System.out.print("The absolute result for the numbers you subtracted is: " + k); 



	}




}