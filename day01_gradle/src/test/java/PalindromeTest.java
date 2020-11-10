import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void fail_case() {
        Palindrome p = new Palindrome("somkiat");
        boolean result = p.compare();
        assertFalse(result);
    }

    @Test
    public void compare_with_even() {
        Palindrome p = new Palindrome("1331");
        boolean result = p.compare();
        assertTrue(result);
    }

    @Test
    public void input_odd() {
        Palindrome p = new Palindrome("TENET");
        boolean result = p.isEven();
        assertFalse(result);
    }

    @Test
    public void input_even() {
        Palindrome p = new Palindrome("1331");
        boolean result = p.isEven();
        assertTrue(result);
    }

    @Test
    public void length_should_be_5() {
        Palindrome p = new Palindrome("TENET");
        int result = p.length();
        assertEquals(5, result);
    }

    @Test
    public void length_should_be_4() {
        Palindrome p = new Palindrome("1331");
        int result = p.length();
        assertEquals(4, result);
    }

}
