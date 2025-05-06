public class FirstArray { 
	public static void main(String[] args) {

	int [] numbers = {22, 51, 38, 23, 48};
	int total = 0;

	System.out.printf("%s%8s%n", "Index", "Value");

	for (int counter = 0; counter < numbers.length; counter++) {
	System.out.printf("%4d%8d%n", counter, numbers[counter]);
	total = total + numbers[counter];
	}
	System.out.printf("Total array value is: %d%n", total);

		//System.out.printf("%s%8s%n", "Index", "Value");
	for (int counter = 0; counter < numbers.length; counter++) {
		//if (counter == 0) System.out.printf("%n%s%d%n%s%d",  "Index:", counter, "Value:", numbers[counter]);
				if (counter == 1) System.out.printf("%6d%n%6d", counter, numbers[counter]);
		if (counter == 0) System.out.printf("%1d%n%1d", counter, numbers[counter]);

	}

	}





}