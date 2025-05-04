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
	      int addMe = 0;
	      for (int x = 1; x <= 1000; x++) {
	      if (prime % x == 0) System.out.print(prime);
	       }
	     return prime;
	}




}