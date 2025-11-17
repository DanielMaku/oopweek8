package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testAdd_Success() {
        assertEquals(20, calc.add(16, 4));
    }

    @Test
    public void testAdd_Fail() {
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.add(Integer.MAX_VALUE, 1));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());
    }

    @Test
    public void testSub_Success() {
        assertEquals(12, calc.sub(16, 4));
    }

    @Test
    public void testSub_Fail() {

        Exception ex = assertThrows(ArithmeticException.class, () -> calc.sub(Integer.MIN_VALUE, 1));
        assertEquals("Number cannot be greater than or equal to Integer.MIN_VALUE", ex.getMessage());

    }

    @Test
    public void testMul_Success() {
        assertEquals(16, calc.mul(4, 4));
    }

    @Test
    public void testMul_Fail() {

        Exception ex = assertThrows(ArithmeticException.class, () -> calc.mul(Integer.MAX_VALUE, 1));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());

    }


    @Test
    public void testDiv_Success() {
        assertEquals(4, calc.mul(8, 2));
    }

    @Test
    public void testDiv_Fail() {

        Exception ex = assertThrows(ArithmeticException.class, () -> calc.div(Integer.MAX_VALUE, 0));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());
    }
}