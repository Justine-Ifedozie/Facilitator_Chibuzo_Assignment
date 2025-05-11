import java.util.Scanner;

public class DriverClassArray5 {
    public static void main(String[] args) {
    Scanner keyboardInput = new Scanner(System.in);
   
    System.out.print("Enter the number of array elements: ");
    int userNumber = keyboardInput.nextInt();
    
    int [] array = new int [userNumber];
    
    int count;
    for (count = 0; count <= array.length -1; count++) {
        System.out.print("Enter array value: ");
        array[count] = keyboardInput.nextInt();
            }
            
    int sumOdd = ArrayOfIntegers.sumOddArray(array);
    System.out.print("The sum of odd numbers in the array list is: " + sumOdd);


       }
}
