import java.util.Scanner;
public class MultiplicationTable {
    public static void main (String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
    
            System.out.print("Enter a number: ");
            int numberA = keyboardInput.nextInt();

            System.out.print("Enter a number: ");
            int numberB = keyboardInput.nextInt();

        multiplicationTableFunction(numberA, numberB);

    }
    //Function to calculate a multiplication table
 public static int multiplicationTableFunction(int numberA, int numberB) {
         int counter;
         int count ;
     for (counter = numberA; counter <= numberB; counter++) {

         for (count = numberA; count <= numberB; count++) {
                         System.out.print("\t" + counter * count + " ");
             }
             System.out.println();
         }
         return counter;
     }
}