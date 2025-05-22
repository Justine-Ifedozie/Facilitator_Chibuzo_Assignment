import java.util.Scanner;
public class SecondLargestArray {
        public static void main (String [] args) {
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.print("Enter array length: ");
        int userInput = keyboardInput.nextInt();
        int [] array = new int [userInput];
        
        for (int count = 0; count < array.length; count++) {
                System.out.print("Enter numbers: ");
                array[count] = keyboardInput.nextInt();
        }
        
        System.out.print(SecondLargestFunction.secondFunction(array));
        
        
        
        
        
        
        
        
        
        
        }
}