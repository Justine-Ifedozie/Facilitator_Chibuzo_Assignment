import java.util.Scanner;
public class FuntionTester { 
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
		System.out.print("Enter an integer: ");
		int number1 = keyboardInput.nextInt();

		System.out.print("Enter an integer: ");
		int number2 = keyboardInput.nextInt();

		System.out.print("Enter an integer: ");
		int number3 = keyboardInput.nextInt();

		System.out.print("Enter an integer: ");
		int number4 = keyboardInput.nextInt();

		int  k = LearningFunctions.AddFourNum(number1, number2, number3, number4);

		System.out.print("The sum of the number you entered is " + k); 

	}



}