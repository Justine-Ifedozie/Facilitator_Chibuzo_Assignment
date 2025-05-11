import java.util.Scanner;

public class DriverClassArray {
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
	 System.out.print("Enter number of array: " );
           int userNum = keyboardInput.nextInt();    
           
           int [] array = new int [userNum];
	          
          int count;
                    
           for (count = 0; count <= array.length -1;  count++) {
               System.out.print("Enter numbers: " );
               array [count] = keyboardInput.nextInt();    
            }
            
            int maximum = ArrayOfIntegers.maximumIn(array);
  
            System.out.print("The maximum number entered is: " + maximum);

	}

}