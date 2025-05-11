import java.util.Scanner;
public class DriverClassArray10 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter the number of Array element: ");
        int userNum = keyboardInput.nextInt();
        
        int [] array = new int [userNum];
        
        for (int count = 0; count < array.length; count++){
            System.out.print("Enter array element number: ");
            array[count] = keyboardInput.nextInt();
                }

           System.out.print("The list of odd numbers in the array is: ");
           
           int [] oddNum = ArrayOfIntegers.printOddNumbersIn(array);
           
           for (int count = 0; count < oddNum.length; count++) {
           System.out.print(oddNum [count]);
           
           if (count < oddNum.length -1) System.out.print(" ,");
            }

    }
}