import java.util.Scanner;
public class TestFile5 { 
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
		System.out.print("Enter an integer: ");
		int number1 = keyboardInput.nextInt();

		int  k = Kata.FactorsOfInteger(number1);

		System.out.print("The number of factors for the number you entered is : " + k); 

	}



}