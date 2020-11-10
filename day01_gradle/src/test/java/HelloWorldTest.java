import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void xxx() {
        Hello hello = new Hello();
        String result = hello.echo("somkiat");
        assertEquals("Hello somkiat", result);
    }

}
