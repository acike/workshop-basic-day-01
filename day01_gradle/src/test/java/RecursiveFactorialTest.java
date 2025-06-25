import org.junit.Test;
import static org.junit.Assert.*;

public class RecursiveFactorialTest {
    @Test
    public void factorial_of_5() {
        RecursiveFactorial rf = new RecursiveFactorial();
        int result = rf.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void factorial_of_1() {
        RecursiveFactorial rf = new RecursiveFactorial();
        int result = rf.factorial(1);
        assertEquals(1, result);
    }
}
