import java.util.Scanner;
public class FuntionTester { 
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
		System.out.print("Enter an integer: ");
		int number1 = keyboardInput.nextInt();

		int  k = LearningFunctions.FindMultiples(number1);

		System.out.print("The fifth multiple of the number you entered is " + k); 

	}



}