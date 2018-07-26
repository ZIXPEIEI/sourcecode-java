import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void number1() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(1);
        assertEquals("1", result);
    }

    @Test
    public void number2() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(2);
        assertEquals("2", result);
    }

    @Test
    public void number3() {
        FizzBuzz2 fz = new FizzBuzz2();
        String result = fz.sendAndReturn2(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void number5() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(5);
        assertEquals("Buzz", result);
    }
    @Test
    public void number6() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(6);
        assertEquals("Fizz", result);
    }
    @Test
    public void number7() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(7);
        assertEquals("7", result);
    }
    @Test
    public void number8() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(8);
        assertEquals("8", result);
    }
    @Test
    public void number9() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(9);
        assertEquals("Fizz", result);
    }
    @Test
    public void number10() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(10);
        assertEquals("Buzz", result);
    }
    @Test
    public void number11() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(11);
        assertEquals("11", result);
    }
    @Test
    public void number12() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(12);
        assertEquals("Fizz", result);
    }
    @Test
    public void number13() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(13);
        assertEquals("13", result);
    }
    @Test
    public void number14() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(14);
        assertEquals("14", result);
    }
    @Test
    public void number15() {
        FizzBuzz2 fz = new FizzBuzz2();
        String result = fz.sendAndReturn2(15);
        assertEquals("FizzBuzz", result);
    }
    

}
