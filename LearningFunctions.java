public class LearningFunctions {

//Method for finding the multiples of a number
	public static int FindMultiples(int x) {
	int total = 0;
	int counter;
	for (counter = 1; counter <= 5; counter++) {
		total = x * counter;
		
		}

	return total;
	}

//Method for displaying the first 50 Prime numbers.
public static void displayPrimeNumbers() {
int counter1, counter2;
int number = 50;
    for (counter1 = 2; counter1 <= number; counter1++) {
        boolean primeNum = true;
        for (counter2 = 2; counter2 <= counter1/2; counter2++) {
                if (counter1 % counter2 == 0) {
                    primeNum = false;
                    break;
                            } //if statement closing brace
                            } //Second for loop closing brace
                           
            if (primeNum) System.out.println(counter1 + " is a prime number");
                    } //First for loop closing brace
        } //Function closing brace



//Method for computing the sum of four numbers. (FuntionTester)
	public static int AddFourNum(int number1) {
		int sum = 0;
		int firstDigit = number1 /  1000;
		int secDigit = number1 % 1000;
		int secDigit1 = secDigit / 100;

		int thirdDigit1 = secDigit % 100;
		int thirdDigit2 = thirdDigit1 / 10;

		int fourthDigit = secDigit % 10;

		sum = firstDigit + secDigit1 + thirdDigit2 + fourthDigit;

		return sum;
	} 
//Function that receives age in years and returns a string.

	public static String AgeString(int AgeYears) {
	int years = AgeYears;
	int months = AgeYears * 12;
	double days = AgeYears * 365.25;
	double minutes = AgeYears * 365.25 * 24 * 60;
	double seconds = AgeYears * 365.25 * 24 * 60 * 60;

	String display = "Age: " + AgeYears + " year(s), " + months + " months, " + days + " days, " + minutes + " minutes, " + seconds + " seconds";

	return display;
	}







//Function for displaying dog age

	public static String DisplayDogAge(String name, int humanYears) {
	int dogyears = humanYears * 7;
	String space = "   ";
	String result = name + space + dogyears;
	return result;
	}




//Method for finding the functions

/*	int divisible = 0;

	for (int count = 2000; count <= 3200; count++) {
	if (count % 7 == 0) System.out.println(count);
	} 

	//divisible = count / 7;

	} */


//Method for finding out a leap year. (FunctionTester2)

	public static boolean isLeapYear(int year) {
	boolean determiner = false;
	if (year % 4 == 0 && year % 100 != 0) determiner = true;
	else{
	determiner = false;
	}
	return determiner;
	}

}