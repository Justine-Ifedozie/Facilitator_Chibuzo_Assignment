public class UniqueElement {
        public static void main(String[] args) {

                int [] nums = {1, 2, 3, 2};

                
                System.out.print(sumUniqueElement(nums));
                
                int [] result = sumUniqueElement(nums);
                        
              for (int counter = 0; counter < result.length; counter++) {
                      System.out.print(result[counter]);
              }

        }
        
        
        public static int [] sumUniqueElement(int [] number) {

              int [] sum = new int [number.length];
              
                for (int index = 0; index < number.length - 1; index++) {
                        for (int count = 0; count < number.length - index - 1; count++) {
                        if (number[index] != number[count +1]) {
                        sum[count] += number[index];
                       }
                       
                       
                        }
                }
             return sum;
        }




}