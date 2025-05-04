import java.util.Scanner;
public class TestFile2 { 
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
		System.out.print("Enter a number to check if it is a prime number: ");
		int number = keyboardInput.nextInt();

		boolean k = Kata.PrimeNumber(number);

		System.out.print("It is "+ k + " that the number you entered is a prime number"); 



	}




}