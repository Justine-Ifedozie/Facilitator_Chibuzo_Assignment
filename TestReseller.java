import java.util.Scanner;
public class TestReseller {
    public static void main(String[] args) {
    Scanner keyboardInput = new Scanner(System.in);
    
    System.out.print("Enter the number of copies: ");
    int numberOfCopies = keyboardInput.nextInt();
    
    int cost = priceFunction(numberOfCopies);
    System.out.print(cost);
    }
    
    
    public static int priceFunction(int copies) {
        int amount = 0;
        if (copies >= 1 && copies <= 4) {
            amount = copies * 2000;
            }
        else if (copies >= 5 && copies <= 9) {
            amount = copies * 1800;
            }
        else if (copies >= 10 && copies <= 29) {
            amount = copies * 1600;
            }
        else if (copies >= 30 && copies <= 49) {
            amount = copies * 1500;
            }
        else if (copies >= 50 && copies <= 99) {
            amount = copies * 1300;
            }
        else if (copies >= 100 && copies <= 199) {
            amount = copies * 1200;
            }
        else if (copies >= 200 && copies <= 499) {
            amount = copies * 1800;
            }
        else if (copies >= 500) {
            amount = copies * 1000;
            }

            return amount;
        }
}