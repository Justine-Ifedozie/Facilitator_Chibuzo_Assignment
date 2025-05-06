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
	public static int PrimeNumber(int prime) {
	      int num = 50, addMe = 0;
	      for (int x = 1; x <= prime; x++) {
	      if (prime % x == 0) {
	      addMe = addMe + 1;
		if (addMe == 2) System.out.print(prime);
		}
	       }
	     return prime;
	}


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