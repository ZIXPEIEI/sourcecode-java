import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {

    @Test
    public void num2() {
       PrimeFactor p = new PrimeFactor();
       String result = p.of(2);
       assertEquals("2",result);
    }
    @Test
    public void num3() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(3);
        assertEquals("3",result);
    }
    @Test
    public void num4() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(4);
        assertEquals("22",result);
    }
    @Test
    public void num6() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(6);
        assertEquals("23",result);
    }
    @Test
    public void num8() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(8);
        assertEquals("222",result);
    }
    @Test
    public void num10() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(10);
        assertEquals("25",result);
    }
    @Test
    public void num12() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(12);
        assertEquals("223",result);
    }

}
