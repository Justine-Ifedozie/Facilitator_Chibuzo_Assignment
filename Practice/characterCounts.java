public class characterCounts {
        public static void main(String[] args) {

         String cardNum = "4388576018410707";
                int sum = 0, add = 0, total = 0;
              String validity = " ";
        for(int count = cardNum.length() - 1; count > -1; count-= 2){
                char characterss = cardNum.charAt(count);
                int digits = Character.getNumericValue(characterss);
                int firstResult = digits * 2;
                int secondResult;
                
                if (firstResult >= 10) {
                        secondResult = (firstResult / 10) + (firstResult % 10);
                }
                else{
                secondResult = firstResult;
                }
                sum += secondResult;
        }
        
        for(int count = 0; count < cardNum.length() -1; count += 2) {
               char characterss = cardNum.charAt(count);
                int digits = Character.getNumericValue(characterss);
                add += digits;
        }
        total = sum + add;
        if (total % 10 == 0) validity = "Valid";

        else if (total % 10 != 0) validity = "Invalid";

System.out.println("sum " + sum);
System.out.println("add " + add);
System.out.println("total " + total);
System.out.println("validity " + validity);
}
}