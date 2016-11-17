package com.tm.test;

import static org.junit.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.hamcrest.core.IsCollectionContaining;
import org.junit.Assume;
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
	
	@Test
	public void testThat()
	{
		assertThat("God is great", is("God is great"));
		String color="red";
		assertThat(color,either(containsString("blue")).or(containsString("red")));
		
		
		
		
	}
	
	@Test
	public void testList()
	{
		List<String> letters=Arrays.asList("a","b","c");
		assertThat(letters,hasItems("b","a"));
		assertThat(letters.size(),is(3));
	}
	
	
	@Test
	public void testMap()
	{
		Map<Integer,String> employees=new HashMap<Integer,String>();
		employees.put(1, "shivam");
		employees.put(2, "stuti");
		employees.put(3, "bala");
		employees.put(4, "kundan");
		
		assertThat(employees.size(),not(is(0)));
		//assertThat(employees, IsMapContaining.hasEntry("3", "bala"));
		//assertThat(employees, IsMapContaining.hasKey(2));
		//assertThat(employees, IsMapContaining.hasValue("shivam"));
		
		
	}
	
	
}
