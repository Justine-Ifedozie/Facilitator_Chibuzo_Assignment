import java.util.Scanner;
public class TicTacToe {
        public static void main (String[] args) {
                char [] [] board = new char [3] [3];
                
                        for (int row = 0; row < board.length; row++) {
                                for (int column = 0; column < board[row].length; column++) {
                                        board[row] [column] = ' ';
                        }
                }

                chat player = 'X';
              boolean gameOver = false;
              Scanner keyboardInput = new Scanner(System.in);
              
              while(!gameOver) {
                      printBoard(board);
                     System.out.println("Player" + player + " enter: ");
                     int row = keyboardInput.nextInt();
                     int column = keyboardInput.nextInt();

                        if (board[row] [column] == ' ') {
                          board[row] [column] = player;
                          gameOver = haveWon(board, player);
                                  if (gameOver) {
                                          System.out.println("Player " + player + " has won: ");
                                         else {
                                         if (player == 'X') {
                                                 player = 'O';
                                         else {
                                                 player = 'X';
                        }
                     else {
                             System.out.println("Invalid move. Try again!");
                     }
              }

        }
        public static boolean haveWon(char[] [] board, char player)
        public static printBoard(char[] [] board) {
               for (int row = 0; row < board.length; row++) {
                                for (int column = 0; column < board[row].length; column++) {
                                        System.out.println(board[row][column] + " ");
        
        }
        } 
}