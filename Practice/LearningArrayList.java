import java.util.ArrayList;

public class LearningArrayList {
        public static void main (String[] args) {
                ArrayList<String> cars = new ArrayList<String>();
              cars.add("Volvo");


                System.out.println(cars);
                int number = 12345;
                
                String num = String.valueOf(number);
                cars.add(num);
                System.out.print(cars);
                System.out.print(cars.get(0));
   }
}