public class TwoDmatrix{
        public static void main(String[] args) {

        int [] [] matrix = {
                                        {1, 2, 3}, 
                                    {4, 5, 6}, 
                                    {7, 8, 9}
                                    };
               
                RotateImage(matrix);
        }
        
        public static int [] [] RotateImage(int[] [] arrays){
                int [][] arrayTwo = new int [3][3];
                for (int row = 0; row < 3; row++) {
                        for (int column = 0; column < 2; column++) {
                       arrayTwo[column] = arrays[row][column];
                        }
          
                        }
                     return arrayTwo;   
                }
        
}