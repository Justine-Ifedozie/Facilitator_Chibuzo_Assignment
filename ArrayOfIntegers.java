public class ArrayOfIntegers {

//Function for calculating maximum in array of integers

public static int maximumIn(int[] array) {
    int maximum = array[0];
         for (int count = 0; count <= array.length -1;  count++) {
               if (array [count] > maximum) maximum =  array [count];
               }
        return maximum;
        }
        
//Function for calculating minimum in array of integers

public static int minimumIn(int[] array) {
    int minimum = array[0];
         for (int count = 0; count <= array.length -1;  count++) {
               if (array [count] < minimum) minimum =  array [count];
        }
        return minimum;
   }

  //Function for calculating the sum of Arrays
  
  public static int sumOfArray(int[] sum) {
      int sumOfElements = 0;
          for (int count = 0; count <= sum.length -1; count++) {
              sumOfElements = sumOfElements + sum[count];
                  }
        return sumOfElements;
          }      
        
 //Function for calculating the sum of even numbers in an Array
 
 public static int sumEvenArray(int[] even) {
 int sum = 0;
     for (int count = 0; count <= even.length -1; count++) {
               if (even [count] % 2 == 0) {
                   sum = sum + even[count];
                   }
                 }
 return sum;
         }
         
          //Function for calculating the sum of odd numbers in an Array
 
 public static int sumOddArray(int[] odd) {
 int sum = 0;
     for (int count = 0; count <= odd.length -1; count++) {
               if (odd [count] % 2 != 0) {
                   sum = sum + odd[count];
                   }
                 }
 return sum;
         }


//Function for calculating maximum and minimum in array of integers and also returning it as an array.

public static int[] maxMini(int[] array) {
    int minimum = array[0];
     int maximum = array[0];
     
         for (int count = 0; count <= array.length -1;  count++) {
               if (array [count] < minimum) minimum =  array [count];
                if (array [count] > maximum) maximum =  array [count];
        }
        return new int [] {minimum, maximum};
   }


         //Function for calculating the number of odd numbers in an Array
 
 public static int numberOddArray(int[] odd) {
 int counter = 0;
     for (int count = 0; count <= odd.length -1; count++) {
               if (odd [count] % 2 != 0) {
                   counter++;
                   }
                 }
 return counter;
         }


 //Function for calculating the number of even numbers in an Array
 
 public static int numberEvenArray(int[] even) {
 int counter = 0;
     for (int count = 0; count <= even.length -1; count++) {
               if (even [count] % 2 == 0) {
                   counter++;
                   }
                 }
 return counter;
         }


    }

