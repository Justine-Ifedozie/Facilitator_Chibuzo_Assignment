public class PrimeNum011 {
    public static void main (String[] args) {
    
    int counter, count;
    for (count = 2; count <= 50; count++) {
        boolean prime = true;
        for (counter = 2; counter <= count/2; counter++) {
            if (count % counter == 0) {
                prime = false;
                break;
                    }
                }
    if (prime) System.out.print(count + " ");
    
        }
    
    
    
    
    
    
    
    
    
    }
    
}