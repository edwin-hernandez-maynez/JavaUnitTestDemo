package calculatorapp;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTests 
{

    @Test
    public void AddTest()
    {
        //ARRANGE
        Calculator calc = new Calculator();
        int a = 5;
        int b = 10;
        int expected = 15;

        //ACT
        int actual = calc.Add(a, b);

        //ASSERT
        Assert.assertEquals("Expected does not match actual", expected, actual);
    }
}
