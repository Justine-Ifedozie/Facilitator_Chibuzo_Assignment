import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
    Scanner keyboardInput = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int userNumber = keyboardInput.nextInt();

    int counter1, counter2;

    for (counter1 = 2; counter1 <= userNumber; counter1++) {
        boolean primeNum = true;
        for (counter2 = 2; counter2 <= counter1/2; counter2++) {
            if (counter1 % counter2 == 0) {
                primeNum = false;
                break;
                    }
            }
            if (primeNum) {
            System.out.println(counter1 + " Is a prime number");
                }
        }


    }
}