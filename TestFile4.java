import java.util.Scanner;
public class TestFile4 { 
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
		System.out.print("Enter first integer: ");
		int number1 = keyboardInput.nextInt();

		System.out.print("Enter second integer: ");
		int number2 = keyboardInput.nextInt();

		float k = Kata.Division(number1, number2);

		System.out.printf("The result for the numbers you divided is: %.2f", k); 



	}



}