import java.util.Scanner;
public class FunctionTester4 { 
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

		System.out.print("Enter dog name: ");
		String dogname = keyboardInput.next();
	
		System.out.print("Enter dog age: ");
		int age = keyboardInput.nextInt();

		String k = LearningFunctions.DisplayDogAge(dogname, age);

		System.out.print("The dog name and his dog_age is: " + k);
	
	}

}