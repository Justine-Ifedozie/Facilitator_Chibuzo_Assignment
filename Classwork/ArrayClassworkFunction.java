public class ArrayClassworkFunction {

public static int[] minimax(int [] array) {
int maximum = array[0];
int minimum = array[0];
int range =0;

    for (int count = 1; count < array.length; count++) {
        if (array[count] > maximum) maximum = array[count];
        if (array[count] < minimum) minimum = array[count];
        }
        range = minimum - maximum;
        
 int [] result = new int[1];
result[0] = range;
return result;
}

}