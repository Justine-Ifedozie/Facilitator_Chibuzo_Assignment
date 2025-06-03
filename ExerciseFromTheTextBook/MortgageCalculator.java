//Mortgage Calculator

//Prompt the client for the amount he wishes to borrow (P - Principal amount).
//Prompt the client for the annual interest rate offered on the mortgage (r - rate).
	//To get r divide annual interest rate by percentage (100) then divide the result by a constant (12 months in a year). 
//Prompt the client for the duration of the mortgage in years (n - the duration of the loan).
	//Multiply it by 12(number of months in a year.

//Automatically calculate the monthly payment for the client (Apply the given formula).
	//1 plus r then raise to power the result by n. Then multiply what you get with r to find the Numerator.
	//1 plus r then raise to power the result by n, then deduct 1. Denominator.
	//Divide the numerator by the denominator.
	//Muliply the result by p to find M.
//Display the monthly payment.

//Where,
//p = principalAmount
//r = rate
//n = mortgageDuration

//m = numberOfMonths


import java.util.Scanner;
public class MortgageCalculator {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	int principalAmount = 0, mortgageDuration = 0, numberOfMonths = 0;
	double rate = 0;
	double annualInterestRate = 0, monthlyPayment = 0;
	double numerator = 0, denomenator = 0, numeratorSub = 0, denominatorSub = 0, denominatorSub2 = 0, numeratorFinal = 0;

	double monthsInYear = 12; //Constant

	System.out.print("Enter the principal amount: ");
	principalAmount = keyboardInput.nextInt();

	System.out.print("Enter the annual interest rate: ");
	annualInterestRate = keyboardInput.nextDouble();

	System.out.print("Enter the mortgage duration in years: ");
	mortgageDuration = keyboardInput.nextInt();

//Calculation to get r.
	rate = annualInterestRate / 100 / monthsInYear;
//Calculation to get the number of months.
	numberOfMonths = mortgageDuration * 12;

//Calculation to get numerator.
	numeratorSub = (1 + rate);
	numerator = Math.pow(numeratorSub, numberOfMonths);
	numeratorFinal = rate * numerator;
//Calculation to get denominator.
	denominatorSub = 1 + rate;
	denominatorSub2 = Math.pow(denominatorSub, numberOfMonths) - 1;
//Divide numerator with denominator
	monthlyPayment = (numeratorFinal / denominatorSub2) * principalAmount;
//Display the result
	System.out.printf("Your monthly payment is $%.2f", monthlyPayment);
	}

}
