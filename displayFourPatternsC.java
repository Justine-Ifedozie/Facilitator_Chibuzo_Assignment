public class displayFourPatternsC {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
                int count = 1;
         for (int j = 6; j >= i; j--) {
                System.out.print(count + " ");
                    count++;
         }
                System.out.println();
        }








    }
}