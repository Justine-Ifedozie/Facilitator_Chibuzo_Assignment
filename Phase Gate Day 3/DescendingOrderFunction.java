public class DescendingOrderFunction {

        public static int [] getDescendingOrder(int [] array, int [] arrayTwo){
                
                for (int index = 0; index < array.length - 1; index ++) {
                        for (int count = 0; count < array.length + index - 1; count++) {
                                if (array[count] < array[count +1]) {
                                        int temp = array[count];
                                        array[count] = array[count + 1];
                                        array[count + 1] = temp;
                        }
                    }
              }
              return array;
        }



        }
        