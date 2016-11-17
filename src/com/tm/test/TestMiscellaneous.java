package com.tm.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.tm.app.Messages;

public class TestMiscellaneous {
	
	@Test
	public void makeItFail()
	{
		fail("you should not be here");
	}
	
	
	@Test
	public void testFail()
	{
		try
		{
		Messages.mustThrowException();
		fail("you should be in catch block");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	

	
	
}
