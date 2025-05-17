import java.util.Scanner;
public class palindromeTest {
    public static void main(String[] args) {
    Scanner keyboardInput = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    int userNumber = keyboardInput.nextInt();
    
    int num = userNumber;
    int baseNum = 0;
    int reverseNum = 0;
    
    while (userNumber  != 0) {
      baseNum = userNumber % 10;
      reverseNum = (reverseNum * 10) + baseNum;
      userNumber = userNumber / 10;
      }
      if (num == reverseNum ) {
          System.out.print("This is a palindrome number");
              }
      else {
          System.out.print("This is not a palindrome number");
          }
    
      
    }
}