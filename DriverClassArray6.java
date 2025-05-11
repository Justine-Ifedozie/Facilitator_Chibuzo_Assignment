import java.util.Arrays;
import java.util.Scanner;

public class DriverClassArray6 {
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
	 System.out.print("Enter number of array elements: " );
           int userNum = keyboardInput.nextInt();    

            int [] array = new int [userNum];
            
            int count;
                        
            for (count = 0; count <= array.length -1; count++) {
                System.out.print("Enter array elements: ");
                array [count] = keyboardInput.nextInt();
                 }
                     
               int [] result = ArrayOfIntegers.maxMini(array);
            System.out.print("The maximum number is: " +  result [1] + " the minimum number is: " + result [0]);

            }
            
 }
