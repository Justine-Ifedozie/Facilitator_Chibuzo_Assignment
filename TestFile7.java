import java.util.Scanner;
public class TestFile7 { 
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
		System.out.print("Enter an integer: ");
		int number1 = keyboardInput.nextInt();

		boolean  k = Kata.FactorialNum(number1);

		System.out.print("It is " + k + " that the number you entered is a palindrome nuumber"); 

	}



}