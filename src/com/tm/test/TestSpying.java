package com.tm.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.tm.app.Calculator;
import com.tm.app.CalculatorService;
import com.tm.app.MathApplication;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;


@RunWith(MockitoJUnitRunner.class)
public class TestSpying {
	
	private MathApplication mathApplication;
	private CalculatorService calculatorService;
	
	@Before
	public void setUp()
	{
		 mathApplication=new MathApplication();
		Calculator calculator=new Calculator();
		calculatorService=spy(calculator);
		mathApplication.setCalculatorService(calculatorService);
		
	}
	
	
	@Test
	public void testAdd()
	{
		assertEquals(mathApplication.add(10,40),50);
	}

}
