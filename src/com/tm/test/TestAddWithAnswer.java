package com.tm.test;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import static org.mockito.Mockito.when;

import static org.mockito.Mockito.mock;

import com.tm.app.CalculatorService;
import com.tm.app.MathApplication;
import static org.mockito.Mockito.mock;

//@RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class TestAddWithAnswer {
	
	
	private MathApplication mathApplication;
	private CalculatorService calculatorService;
	
	
	@Before
	public void setUp()
	{
		mathApplication=new MathApplication();
		calculatorService=mock(CalculatorService.class);
		mathApplication.setCalculatorService(calculatorService);
		
	}
	
	
	@Test
	   public void testAdd()
	   {
	
		when(calculatorService.add(10,30)).thenAnswer(new Answer<Integer>(){
		
		
		@Override
		public Integer answer(InvocationOnMock invocation) throws Throwable
		{
			
			Object[] args=invocation.getArguments();
			
			System.out.println("Arguments "+args[0]+","+args[1]);
			
			Object mock=invocation.getMock();
			
			System.out.println("Mock "+mock);
			
			return 40;
			
		}
	});
	
	Assert.assertEquals(mathApplication.add(10, 30),40);
	
	}
	
	
	
	
	
	}


