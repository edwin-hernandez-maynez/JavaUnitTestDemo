package calculatorapp;

// import org.junit.Assert;
// import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Test;


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
        Assert.assertEquals(expected, actual,"Expected does not match actual");
    }

    @Test
    public void MultiplicationTest()
    {
        //ARRANGE
        Calculator calc = new Calculator();
        int a = 5;
        int b = 10;
        int expected = 50;

        //ACT
        int actual = calc.Multiply(a, b);

        //ASSERT
        Assert.assertEquals(expected, actual,"Expected does not match actual");
    }
}
