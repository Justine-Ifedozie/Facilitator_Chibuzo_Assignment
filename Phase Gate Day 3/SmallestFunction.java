public class SmallestFunction {

        public static int getSmallest(int [] array){
                    int maximum = array[0];
                  int index = 0;
                 for (int count = 0; count <= array.length -1;  count++) {
                       if (array [count] > maximum && maximum != array [count]) {
                       maximum =  array [count];
                       index = count;
               
               }
               }
        return index;
        }

}