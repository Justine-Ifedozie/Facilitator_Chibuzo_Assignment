import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmallestElementTest {

        @Test
        public void testThatgetSmallestfunctionExist() {
                getSmallest smallest = new getSmallest();
               assertEquals(self);
        }
        @Test
        public void testThatgetSmallestfunctionReturnsResultWell() {
                getSmallest smallest = new getSmallest();
                int result [] = {1, 5, 3, 4, 5, 5};
                int expected = 1;
               assertArrayEquals(expected , result);
        }
        
}
