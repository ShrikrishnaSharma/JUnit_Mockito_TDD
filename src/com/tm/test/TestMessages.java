package com.tm.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.tm.app.Messages;

public class TestMessages {

	@Test
	public void testMyName()
	{
		System.out.println("in test my name");
		String myName=Messages.getMyName();
	
		assertTrue("shivam".equals(myName));
		assertFalse("shubham".equals(myName));
	}
	
	
	@Test
	public void testNullObjects()
	{
		System.out.println("in test null objects");
		assertNull(Messages.getNullObject());
		assertNotNull(Messages.getNonNullObject());
	}
	
	@Test
	public void testMessages()
	{
		String msg1="abc";
		String msg2="abc";
		assertSame(msg1,msg2);
		assertNotSame(msg1,msg2);
	}
	
	@Test(timeout=1000)
	public void testTimeout()
	{
		while(true);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testExpectedException()
	{
		int a=4/0;
	}
}
