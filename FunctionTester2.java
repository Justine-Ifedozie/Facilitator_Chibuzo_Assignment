import java.util.Scanner;
public class FunctionTester2 { 
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
		System.out.print("Enter an integer: ");
		int number1 = keyboardInput.nextInt();

		boolean  k = LearningFunctions.isLeapYear(number1);

		System.out.print("It is " + k + " that the year you entered is a leap year"); 


	}

}