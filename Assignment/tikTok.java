public class tikTok {
        public static void main(String[] args) {

        char [] [] array = new char [3] [3];

        spacer(array);

        gameBoard(array);

        }
        
      public static void spacer(char array [][]){
              for(int row = 0; row < 3; row++){
                      for(int column = 0; column < 3; column++){
                              array[row] [column] = ' ';   
              }
          }
      }  
        
        
       public static void gameBoard(char [] [] line){
               for (int column = 0; column < line.length; column++) {
                       for (int row = 0; row < line.length; row++) {
                               System.out.print(line[column] [row]);
                              if (row < 2) System.out.print("|");
                       }
                 System.out.println();
                if (column < 2) System.out.print("---------");
                 System.out.println(); 
          }
       }

}