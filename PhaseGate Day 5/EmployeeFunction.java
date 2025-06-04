import java.util.Scanner;
//import java.util.ArrayList;

public class EmployeeFunction {
String [] array = [10]
//static ArrayList <EmployeeFunction> employeeNames = new ArrayList<String>();

        public static void addEmployeePayroll() {
              Scanner keyboardInput = new Scanner(System.in); 

              double grossPay = 0;
                String employeeName = " ";
                
                double numberOfHoursWorked = 0, hourlyPayrate = 0, federalTaxRate = 0, stateTaxRate;

              
              System.out.print("Enter Employee Name: ");  
                employeeName = keyboardInput.next();
                
                System.out.print("Enter number of hours worked in a week: ");  
                numberOfHoursWorked = keyboardInput.nextDouble();
                
                System.out.print("Enter hourly payrate: ");  
                hourlyPayrate = keyboardInput.nextDouble();

                System.out.print("Enter Federal tax witholding rate: ");  
                federalTaxRate = keyboardInput.nextDouble();

                System.out.print("Enter State tax witholding rate: ");  
                stateTaxRate = keyboardInput.nextDouble();
                
                 grossPay = numberOfHoursWorked *  hourlyPayrate;
                 
                System.out.print("Employee Payroll added =====>");
                
                array = {employeeName, numberOfHoursWorked, hourlyPayrate, federalTaxRate, stateTaxRate, grossPay};
        }

        //public static void viewEmployeePayroll() {
                //for (int count = 0; count <array.length; count++){
                        //System.out.print(array[count]);
                }
        }













}