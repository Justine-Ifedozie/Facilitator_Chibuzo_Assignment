public class ArrayFunction11 {

        public static int [] MiniMaxi(int [] array){
              int [] sum = new int [array.length];
              int total = 0, counter = 0, minimum = 5666666, maximum = sum [0];

                for(int count = 0; count < array.length; count++){
                                              
                        for (counter = 0; counter < array.length; counter++) {
                                if (array[count] != array[counter]) {
                                sum [count]  += array[counter];
                                }
                        }
                               if (sum [count] < minimum) minimum = sum [count];
                                if (sum [count] > maximum) maximum = sum [count];

                }
                                return new int [] {minimum, maximum};
        }

               // {8,0,1,4,9,2}
}