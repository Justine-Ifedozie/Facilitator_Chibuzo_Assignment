import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

        @Test
        public void testThatTwoPlusTwoShouldEqualFour() {
                SimpleCalculator calculator = new SimpleCalculator();
               assertEquals(4, calculator.add(2, 2));
        }
}