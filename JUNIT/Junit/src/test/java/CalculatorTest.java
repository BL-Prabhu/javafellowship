import calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest
{
    @Test
    void checkAddMethod()
    {
        var cal=new Calculator();
        assertEquals(4,cal.add(2,2));
    }

    @Test
    public void checkMulMeethod()
    {
        var mul=new Calculator();
        assertEquals(16,mul.mul(4,4));
    }
}
