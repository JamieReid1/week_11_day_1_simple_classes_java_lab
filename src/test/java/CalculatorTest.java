import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd (){
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void canSubtract (){
        assertEquals(4, calculator.subtract(6, 2));
    }

    @Test
    public void canMultiply(){
        assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    public void canDivide(){
        assertEquals(4, calculator.divide(8, 2));
    }


}
