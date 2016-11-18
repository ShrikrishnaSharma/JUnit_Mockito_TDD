package com.tm.test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tm.app.Calculation;

public class TestCalculation {
	
	
	
	@BeforeClass
	public static  void beforeClass()
	{
		System.out.println("before class");
	}
	
	@Before
	public  void beforeTest()
	{
		System.out.println("before test");
	}
	
	@Test
	public void testMax()
	{
		
		System.out.println("in test max");
		assertEquals(4,Calculation.findMax(new int[]{4,2,-1,-7}));
		assertTrue("failure - should be true", false);
		assertEquals("value is not correct",9,Calculation.findMax(new int[]{11,4,9,2}));
		
	}
	
	@Test
	public void testCube()
	{
		System.out.println("in test cube");
		assertEquals(27,Calculation.findCube(3));
		assertEquals(512,Calculation.findCube(8));
	}
	
	@After
	public  void afterTest()
	{
		System.out.println("after test");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("after class");
	}

}
