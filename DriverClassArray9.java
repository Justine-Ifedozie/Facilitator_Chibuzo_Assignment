import java.util.Scanner;

public class DriverClassArray9 {
    public static void main(String[] args) {
    Scanner keyboardInput = new Scanner(System.in);
   
    System.out.print("Enter the number of array elements: ");
    int userNumber = keyboardInput.nextInt();
    
    int [] array = new int [userNumber];
    
    int count;
    for (count = 0; count < array.length; count++) {
        System.out.print("Enter array value: ");
        array[count] = keyboardInput.nextInt();
            }
            
    int [] sumEven = ArrayOfIntegers.displayEvenArray(array);
    
  System.out.print("The even numbers in the array list is: ");
    
    for (int counter = 0; counter < sumEven.length; counter++) {
           if (counter < sumEven.length -1) System.out.print(" ,");
            }
       }
}
