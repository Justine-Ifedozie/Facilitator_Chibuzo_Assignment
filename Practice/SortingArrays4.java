import java.util.Arrays;

public class SortingArrays4 {
        public static void main(String[] args) {

                int [] array = {3, 93, 34, 14, 45, 21, 35};
                  
                  int [] result = addArray(array);
                         
                String output = Arrays.toString(result);
                
                String output1 = Arrays.toString(array);
                  
                  System.out.println("The original order of elements in the array is: " + output1);

                System.out.println("The reverse of elements in the array is: " + output);
        }
        
        public static int [] addArray(int [] array) {
               int [] reversed = new int [array.length];
                for (int count = array.length -1, counter = 0; count >= 0; count--, counter++) {
                     reversed[counter] = array[count];
              }
                return reversed;
        }

}

