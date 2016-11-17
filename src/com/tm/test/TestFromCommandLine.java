package com.tm.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestFromCommandLine {
	
	public static void main(String gg[])
	{
		Result result=JUnitCore.runClasses(TestMessages.class);
		
		System.out.println("Total test executed: "+result.getRunCount());
		
		
		for(Failure failure:result.getFailures())
		{
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}

}
