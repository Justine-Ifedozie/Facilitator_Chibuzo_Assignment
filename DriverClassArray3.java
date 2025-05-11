import java.util.Scanner;

public class DriverClassArray3 {
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
	 System.out.print("Enter number of array elements: " );
           int userNum = keyboardInput.nextInt();    
                          
               int [] sum = new int [userNum];
               
               int count;
               for (count = 0; count <= sum.length -1; count++) {
                       System.out.print("Enter array elements: ");
                       sum [count] = keyboardInput.nextInt(); 
                    }   
               
               int sumOfNumbers = ArrayOfIntegers.sumOfArray(sum);
               System.out.print("Sum of array elements is: " + sumOfNumbers);
    }
    
}