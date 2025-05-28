public class UniqueNumber2 {
        public static void main(String[] args) {

                int [] nums = {1, 2, 3, 2};

                
                int [] result = UniqueElement(nums);
                        
              for (int counter = 0; counter < result.length; counter++) {
                      System.out.print(result[counter]);
              }

        }
        
        
        public static int [] UniqueElement(int [] number) {

              int [] unique = new int [number.length];
              
                for (int index = 0; index < number.length - 1; index++) {
                        for (int count = 0; count < number.length - index - 1; count++) {
                        if (number[index] != number[count +1]) {
                        unique[count] += number[index];
                       }
                       
                       
                        }
                }
             return sum;
        }




}
