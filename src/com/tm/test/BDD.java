package com.tm.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.tm.app.CalculatorService;
import com.tm.app.MathApplication;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.BDDMockito.*;


@RunWith(MockitoJUnitRunner.class)
public class BDD {
	
	
	 private MathApplication mathApplication;
	   private CalculatorService calcService;

	   @Before
	   public void setUp(){
	      mathApplication = new MathApplication();
	      calcService = mock(CalculatorService.class);
	      mathApplication.setCalculatorService(calcService);
	   }

	   @Test
	   public void testAdd(){
		   
		   //Given
		   given(calcService.add(50,70)).willReturn(120);
		   
		   
		   //When
		   int a=calcService.add(50,70);
		   
		   
		   //Then
		   assertEquals(a,120);
	   }

}
