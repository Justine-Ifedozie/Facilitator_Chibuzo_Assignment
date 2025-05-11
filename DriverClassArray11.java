import java.util.Scanner;
public class DriverClassArray11 {
    public static void main(String[] args) {
    Scanner keyboardInput = new Scanner(System.in);
    
    System.out.print("Enter number of elements in the array: ");
    int userNum = keyboardInput.nextInt();
    
    int [] array = new int [userNum];
    
    for (int count = 0; count < array.length; count++) {
        System.out.print("Enter element value: ");
        array[count] = keyboardInput.nextInt();
        }
        
     int [] squareNumber = ArrayOfIntegers.squareOfNumbers(array);
        for (int count = 0; count < squareNumber.length; count++) {
            System.out.print(squareNumber[count]);
            if (count < squareNumber.length -1) System.out.print(" ,");
            }


    }
}