package com.acquisio.basic.java.question8;


import org.junit.Assert;
import org.junit.Assert.*;
/**
 * Test class for calculator class
 * @author Ekow-Daniels
 *
 */
public class CalculatorTest {

    // TODO: Insert your code here.
    	int x, y, result;
	
	@Before
	public void setup()
	{
		this.x =7;
		this.y=0;
		
	}
	
	@Test
	public void testAddition()
	{
		int result= Calculator.applyOperation(x, y, '+');
		Assert.assertSame(result, 7);
		
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSubtraction()
	{
		int result= Calculator.applyOperation(x, y, '-');
		Assert.assertEquals(result, 7);
		
		
	}
	
	@SuppressWarnings("deprecation")
	@Test(expected=ArithmeticException.class)
	public void testDivision()
	{
		 Calculator.applyOperation(x, y, '/');
		
		
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testMultiplication()
	{
		int result= Calculator.applyOperation(x, y, '*');
		Assert.assertEquals(result,0);	
		
	}
	
	@SuppressWarnings("deprecation")
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidOperator()
	{
		 Calculator.applyOperation(x, y, '^');
		
		
		
	}
}
