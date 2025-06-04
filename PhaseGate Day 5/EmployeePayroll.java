import java.util.Scanner;
import java.util.ArrayList;

public class EmployeePayroll { 
        public static void main (String[] args) { 
                Scanner keyboardInput = new Scanner(System.in); 

                boolean meNU = true;
                while (meNU) {

                String mainMenu = """
Welcome to Semicolon Employees Payroll!
=============================
List of payroll functions:

Press: 
1. Add Employee Payroll
2. View Employees Payroll
3. Update Emplyees Payroll
4. Exit
=============================
                """;

                System.out.println(mainMenu);
                System.out.print("Press a number to make a selection between 1 - 4: ");
                int menu = keyboardInput.nextInt();

                if (menu < 0 || menu > 4) {
                        System.out.println("You entered an invalid option!! Kindly try again or press 0 for Yoruba");
                        System.out.print("Press a number to make a selection between 1 - 4: ");
                        menu = keyboardInput.nextInt();
                        }

                switch (menu) {
                case 1: { 
                                EmployeeFunction.addEmployeePayroll();
                                }
                                
                case 2: { 
                                //viewEmployeePayrol();
                                }

                case 3: { 

                                }

                case 4: { 
                        meNU = false; return;
                                 }

                }
        }

    }
}