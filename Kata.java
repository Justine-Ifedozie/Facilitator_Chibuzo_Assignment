public class Kata {

//Method for finding Even number.
	public static boolean isEven(int x) {
	      boolean evenNum;
	       if (x % 2 == 0) {
	       evenNum = true;
	       }
	       else {
	       evenNum = false;
	       }
	       return evenNum;
	}


//Method for finding Prime number.
	public static boolean PrimeNumber(int prime) {
	      int addMe = 0;
	      for (int x = 1; x <= prime; x++) {
	       if (prime % x == 0) {
	       addMe = addMe + 1;
	       }
	}
		if (addMe == 2) return true;
	       return false;
	}

//Method for Absolute Subtraction.
	public static int Subtract(int x, int y) {
	int result;
	int z;
	result = x - y;
	if (y > x) {
	z = y;
	y = x;
	x = z;
	result = x -y;
	}
	return result;
	}

//Method for Division
	public static float Division(int x, int y) {
	float result;
	if (y == 0) return 0;
	result = (float) x / y;
	return result;
	}

//Method for Factors of a number
	public static int FactorsOfInteger(int x) {
	int total = 0;
	int addMe = 0;
	for (int counter = 1; counter <= x; counter++) {
		if (x % counter == 0) {
		total++;
		}
	}
	return total;
	}

//Method for finding out if a number is a square number.
	public static boolean isSquare(int x) {
	double sqrX = Math.sqrt(x);
	int sqroot = (int) sqrX;
	int result = sqroot * sqroot;
	if (result == x) return true;
	return false;
	}

//Method for returning the factorial of a number.
	public static long FactorialNum(int x) {
	long total = 1;
	for (int count = 1; count <= x; count++) {
	total *= count;
	}
	return total;
	}












//Method for returning a square number.
	public static long SquareInteger(int x) {
	long sqroot = x * x;
	long result = sqroot;
	return result;
	}




}