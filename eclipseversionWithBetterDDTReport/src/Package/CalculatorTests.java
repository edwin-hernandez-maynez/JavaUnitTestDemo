package Package;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Package.Calculator;

public class CalculatorTests {

  @Test
  @Parameters({"InputA","InputB", "InputC"})
  public void MultiplyTest_MultipleSetOfNumbersXML_ValidCase (String inputA, String  inputB, String inputC)
  {
      //ARRANGE
 	 Calculator calc = new Calculator();
      int a = Integer.parseInt(inputA);
      int b = Integer.parseInt(inputB);
      int expected = Integer.parseInt(inputC);
      
      //ACT
      int actual = calc.Multiply(a, b);
      
      //ASSERT
      Assert.assertEquals(actual, expected, "Actual and Expected do not match");
  }
  
  
//
//  @Test (dataProvider = "SetOfNumbers")
//  public void Multiply_WithSeveralValidIntegers_ReturnValidMultiplication(int a, int b, int expected)
//  {
//      //ARRANGE
//      Calculator calc = new Calculator();
//
//      //ACT
//      int actual = calc.Multiply(a, b);
//      
//      //ASSERT
//      Assert.assertEquals(expected, actual, "Expected does not match actual");
//  }
//
//  @DataProvider(name="SetOfNumbers")
//  public Object[][] SetOfNumbers(){
//      return new Object[][]
//      {
//          {2,10,20},
//          {10,50,500},            
//          {2,10,20},
//          {10,50,500},            
//          {2,10,20},
//          {10,50,500},            
//          {2,10,20},
//          {10,50,500},            
//          {2,10,20},
//          {10,50,500},            
//          {2,10,20},
//          {10,50,500},            
//          {2,10,20},
//          {10,50,500},            
//          {2,10,20},
//          {10,50,0}
//      };
//  }
}
