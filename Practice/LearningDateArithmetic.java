import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LearningDateArithmetic {
        public static void main (String[] args) {
                Scanner keyboardInput = new Scanner(System.in);
                
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                
                System.out.print("Enter the date your period started (yyyy-mm-dd): ");
                String userdate1 = keyboardInput.nextLine();
                LocalDate dateOne = LocalDate.parse(userdate1, formatter);
                
                System.out.print("Enter the date your period ended (yyyy-mm-dd): ");
                String userdate2 = keyboardInput.nextLine();
                  LocalDate dateTwo = LocalDate.parse(userdate2, formatter);
                
                  long daysDifference = ChronoUnit.DAYS.between(dateOne, dateTwo);
                
                  System.out.println(dateTwo);
                
                //LocalDate date = today.minusDays(userdate);
                    //LocalDate date = today.plusDays(userdate);

                System.out.println(dateOne);
              
               System.out.println(daysDifference);
        }
}
