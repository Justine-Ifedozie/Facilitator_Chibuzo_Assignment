import java.time.LocalDate;
import java.util.Scanner;

public class LearningDateSpecific {
        public static void main (String[] args) {
                Scanner keyboardInput = new Scanner(System.in);
                
                System.out.print("Enter the year: ");
                int userdate = keyboardInput.nextInt();
                
                LocalDate date = LocalDate.of(userdate, 10, 26);
              System.out.println(date);
              
              
        }
}
