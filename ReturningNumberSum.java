import java.util.Scanner;
public class ReturningNumberSum {
    public static void main(String[] args) {
    Scanner keyboardInput = new Scanner(System.in);
    
    System.out.print("Enter an integer between 1 to 10,000: ");
    int userInput = keyboardInput.nextInt();
    
    if (userInput < 1 || userInput > 10000) System.out.println("Invalid input!");
    
    int baseNum = 0;
    int add = 0;
    
    while (userInput != 0) {
        baseNum = userInput % 10;
        userInput = userInput / 10;
        add = add + baseNum;
        }
        
    System.out.print(add);











    }
}