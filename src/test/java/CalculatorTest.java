import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest
{
    Calculator MyCalc;
    @BeforeEach
    void setup()
    {
        MyCalc = new Calculator();
    }

    @Test
    void TestAddSuccess()
    {
        assertEquals(8, MyCalc.add(4,4));
    }

    @Test
    void TestAddFailure()
    {
       Exception ex = assertThrows(IllegalArgumentException.class, ()-> {MyCalc.add(Integer.MAX_VALUE,4);});
        assertEquals("Input is too large", ex.getMessage());
    }

}
