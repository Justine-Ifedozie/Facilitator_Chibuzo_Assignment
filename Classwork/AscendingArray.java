public class AscendingArray {
        public static void main (String[] args) {
        
        int array [] = {7, 2, 9, 3, 0, 8};
        
        
        int list [] = ascendingOrder(array);
        
        for (int count = 0; count < list.length; count++) {
                System.out.print(list[count] + ",");
                }
        }

        public static int [] ascendingOrder(int array []) {
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