import java.util.Scanner;
public class FunctionTest22 { 
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
		System.out.print("Enter age in years: ");
		int age = keyboardInput.nextInt();

		String  k = LearningFunctions.AgeString(age);

		System.out.print(k); 

	}



}