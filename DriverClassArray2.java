import java.util.Scanner;

public class DriverClassArray2 {
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
                     
               int minimum = ArrayOfIntegers.minimumIn(array);
            System.out.print("The minimum number entered is: " + minimum);

            }
            
 }