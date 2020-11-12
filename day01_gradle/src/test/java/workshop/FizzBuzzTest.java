package workshop;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void say_kbtg() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("KBTG", fizzBuzz.say(11));
    }

    @Test
    public void say_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.say(1));
        assertEquals("2", fizzBuzz.say(2));
        assertEquals("16", fizzBuzz.say(16));
    }

    @Test
    public void say_fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.say(3));
        assertEquals("Fizz", fizzBuzz.say(6));
        assertEquals("Fizz", fizzBuzz.say(9));
        assertEquals("Fizz", fizzBuzz.say(12));
    }

    @Test
    public void say_buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.say(5));
        assertEquals("Buzz", fizzBuzz.say(10));
    }

    @Test
    public void say_fizzbuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.say(15));
    }

}