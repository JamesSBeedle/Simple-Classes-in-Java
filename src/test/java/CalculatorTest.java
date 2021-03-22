import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(18, calculator.add(12, 6));
    }

    @Test
    public void canSubtract() {
        assertEquals(2, calculator.subtract(12,10));
    }

    @Test
    public void canMultiply() {
        assertEquals(8, calculator.multiply(4,2));
    }

    @Test
    public void canDivide() {
        assertEquals(3.5, calculator.divide(7.00, 2.00), (0.0));
    }

}
