import java.util.Arrays;

public class SortingArrays3 {
        public static void main(String[] args) {

                int [] array = {3, 93, 34, 14, 45, 21, 35};
                
                  int [] array2 = {3, 7, 16, 54, 4, 21, 4};
                  
                  int [] result = addArray(array, array2);
                         
                String output = Arrays.toString(result);
                  
                System.out.println("The sum of elements in the array is: " + output);
        }
        
        public static int [] addArray(int [] array, int [] array2) {
                int minLength;
               if (array.length > array2.length) minLength = array.length;
               else{
                       minLength = array2.length;
               }
               
               int [] sum = new int [minLength];
                for (int count = 0; count < minLength; count++) {
                     sum[count] = array[count] + array2[count];
              }
                return sum;
        }

}
