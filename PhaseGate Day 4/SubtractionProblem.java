import java.util.Scanner;
import java.util.Random;
public class SubtractionProblem {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	Random rand = new Random();

int count = 1;
int counter = 0;

while (count != 10) {
int minuend = rand.nextInt(1, 20);

int subtrahend = rand.nextInt(20, 40);

int temp = 0;
int result = 0;

if (minuend > subtrahend) {
        minuend = subtrahend;
        }
else{
       temp = minuend;
       minuend = subtrahend;
       subtrahend = temp;
        }

result = minuend - subtrahend;
System.out.println(result);
System.out.print("What is the answer to: " + minuend + " - " + subtrahend + ": ");
int userAnswer = keyboardInput.nextInt();

if (result == userAnswer) {
System.out.println("You got the right answer");
counter++;
}

else{
System.out.println("Wrong answer! you have one trial");
System.out.print("What is the answer to: " + minuend + " - " + subtrahend + ": ");
userAnswer = keyboardInput.nextInt();
}

count++;

}

System.out.print("Your score is " + counter + " out of " + count + " questions");
	}
}


