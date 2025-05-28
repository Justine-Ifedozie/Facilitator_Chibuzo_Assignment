public class LargestNumber {
        public static void main(String[] args) {

                int [] [] arrays = {{1.5, 2.3, 3.7, 4.6} {5.1, 6.2, 7.3, 8.4} {9.5, 10.1, 11.8, 12.7}};

                
                int [] result = largestNumber(arrays);
                        
              for (int counter = 0; counter < result.length; counter++) {
                      System.out.print(result[counter]);
              }

        }
        
        
        public static int [] largestNumber(int [] number) {
                  int [] maximum = numbers[0];
                for (int index = 0; index < number.length; index++) {
                        if (number[index] > maximum) maximum = number[index];

                }
             return maximum;
        }




}
