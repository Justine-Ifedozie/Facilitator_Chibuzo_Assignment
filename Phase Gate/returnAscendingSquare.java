public class returnAscendingSquare {
        public static void main (String[] args) {
        
        int array [] = {9, 2, 7, 0, 5};
        
        
        int list [] = ascendingOrder(array);
        
        for (int count = 0; count < list.length; count++) {
                System.out.print(list[count]);
                }
        }



        public static int [] ascendingOrder(int arrays []) {
                int [] array = new int [arrays.length];
                
                for (int counter = 0; counter < arrays.length; counter++){
                        array[counter] = arrays[counter] * arrays[counter];
                        }
        
                for (int index = 0; index < array.length - 1; index ++) {
                        for (int count = 0; count < array.length - index - 1; count++) {
                                if (array[count] > array[count +1]) {
                                        int temp = array[count];
                                        array[count] = array[count + 1];
                                        array[count + 1] = temp;
                        }
                    }
              }
              return array;
        }


}
