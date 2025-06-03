import java.util.Scanner;
public class ReverseWords {
        public static void main (String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String userInput = keyboardInput.nextLine();
       
       System.out.print(reverseArray(userInput));
       
        }

        public static String reverseArray(String userSentence){
                String reversed = " ";
               for (int index = userSentence.length() - 1; index >= 0; index--) {
                        reversed += userSentence.charAt(index);
                }
             return reversed;
        }


}