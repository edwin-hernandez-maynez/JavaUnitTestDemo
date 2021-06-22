package calculatorapp;

//import org.junit.Assert;
//import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.junit.rules.Timeout;


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

    @Test //(timeout = 100)
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
        Assert.assertEquals(expected, actual, "Expected does not match actual");
        
    }

    @Test (dataProvider = "SetOfNumbers")
    public void Multiply_WithSeveralValidIntegers_ReturnValidMultiplication(int a, int b, int expected)
    {
        //ARRANGE
        Calculator calc = new Calculator();

        //ACT
        int actual = calc.Multiply(a, b);
        
        //ASSERT
        Assert.assertEquals(expected, actual, "Expected does not match actual");
    }

    @DataProvider(name="SetOfNumbers")
    public Object[][] SetOfNumbers(){
        return new Object[][]
        {
            {2,10,20},
            {10,50,500},            
            {2,10,20},
            {10,50,500},            
            {2,10,20},
            {10,50,500},            
            {2,10,20},
            {10,50,500},            
            {2,10,20},
            {10,50,500},            
            {2,10,200},
            {10,50,500},            
            {2,10,20},
            {10,50,500},            
            {2,10,20},
            {10,50,500}
        };
    }
    
}
