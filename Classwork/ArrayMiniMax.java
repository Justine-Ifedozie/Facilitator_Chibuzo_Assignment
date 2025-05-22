import java.util.Scanner;

public class ArrayMiniMax {
        public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.print("Enter number of elements in the array: ");
        int userInput = keyboardInput.nextInt();
        int [] array = new int [userInput];
        
        for (int count = 0; count < array.length; count++) {
         System.out.print("Enter number to be stored in the array: ");
        array[count] = keyboardInput.nextInt();
        }
        
       int [] result = ArrayFunction11.MiniMaxi(array);
               for (int count = 0; count < result.length; count++) {
               System.out.print(result[count]);
               }














        }
}