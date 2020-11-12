import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeFactorTest {

    @Test
    public void number_2() {
        PrimeFactor primeFactor = new PrimeFactor();
        Integer[] results = primeFactor.of(2);
        assertArrayEquals(new Integer[]{2}, results);
    }

    @Test
    public void number_4() {
        PrimeFactor primeFactor = new PrimeFactor();
        Integer[] results = primeFactor.of(4);
        assertArrayEquals(new Integer[]{2,2}, results);
    }

    @Test
    public void number_8() {
        PrimeFactor primeFactor = new PrimeFactor();
        Integer[] results = primeFactor.of(8);
        assertArrayEquals(new Integer[]{2,2,2}, results);
    }

}