package com.tm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.tm.app.CalculatorService;
import com.tm.app.MathApplication;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.timeout;


@RunWith(MockitoJUnitRunner.class)
public class TestMathApplication {
	
	
	@InjectMocks
	MathApplication mathApplication=new MathApplication();
	
	@Mock
	CalculatorService calculatorService;
	
	@Test//(expected=RuntimeException.class)
	public void testAdd()
	{
		
		
		when(calculatorService.add(50,30)).thenReturn(80);
		
		assertEquals(mathApplication.add(50,30),80);
		
		assertEquals(mathApplication.add(50,30),80);
		assertEquals(mathApplication.add(50,30),80);
		
		verify(calculatorService,times(3)).add(50,30);
		//verify(calculatorService, never()).add(50,30);
		//verify(calculatorService,atLeastOnce()).subtract(50.0,30.0);
		verify(calculatorService,atMost(3)).add(50,30);
		
		when(calculatorService.add(60, 30)).thenThrow(new RuntimeException());
		
		//doThrow(new RuntimeException("add operation not implemented with this arguments")).when(calculatorService).add(60,30);
		assertEquals(mathApplication.add(50,30),80);
		
		
		//assertEquals(mathApplication.add(60,30),80);
		
		/*InOrder inOrder=inOrder(calculatorService);

		inOrder.verify(calculatorService).subtract(20.0,10.0);
		inOrder.verify(calculatorService).add(50,30);*/
		
		//reset(calculatorService);
		
		
		assertEquals(mathApplication.add(50,30),80);
		
		
		
	}

}
