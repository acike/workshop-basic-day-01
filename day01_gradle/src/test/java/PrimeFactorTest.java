import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeFactorTest {

    @Test
    public void number_2() {
        PrimeFactor primeFactor = new PrimeFactor();
        int[] results = primeFactor.of(2);
        assertArrayEquals(new int[]{2}, results);
    }

}