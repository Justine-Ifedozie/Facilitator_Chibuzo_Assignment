public class SecondLargestFunction {
        
        public static int secondFunction(int [] number) {
        int count = 0;
        int second_maximum = 0;
        int maximum = number[0];
        
        for (count = 0; count < number.length; count++) {
                if (number[count] > maximum) {
                        second_maximum = maximum;
                        maximum = number[count];
                }
                else if (number[count] > second_maximum && number[count] != maximum) second_maximum = number[count];
        }

                return second_maximum;

        }
}