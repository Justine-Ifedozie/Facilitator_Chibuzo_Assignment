import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
public class KataDivisionTest{

//First two tests are done without creating an instance of the Kata class
        @Test
        public void testDivision_positiveNumbers() {
                int x = 10;
                int y = 2;
                float result = Kata.Division(x, y);
                assertEquals(5.0f, result, 0.001f, "10/2 should be 5.0");
        }

        @Test
        public void testDivision_floatResult() {
                int x = 7;
                int y = 2;
                float result = Kata.Division(x, y);
                assertEquals(3.5f, result);
        }
//Remaining tests are done by creating an object of class Kata

        @Test
        public void testDivision_negativeNumers() {
                Kata division = new Kata();
                int x = -10;
                int y = 2;
                float result = division.Division(x, y);
                assertEquals(-5.0f, result);
        }


        @Test
        public void testDivision_zeroByNonZero() {
                Kata division = new Kata();
                int x = 0;
                int y = 5;
                float result = division.Division(x, y);
                assertEquals(0.0f, result);
        }

}
