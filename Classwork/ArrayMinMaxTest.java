import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ArrayMinMaxTest{

@Test
    public void testArrayRange() {
    int [] array = {5, 6, 10, 15, 20};
    int [] expected = {15};
    //ArrayClassworkFunction ray = new ArrayClassworkFunction();
    int [] ray = ArrayClassworkFunction.minimax(array);
    assertArrayEquals(expected, ray);
    
    }

}