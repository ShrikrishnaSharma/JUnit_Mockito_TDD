package com.tm.app;

public class Calculation {

	public static int findMax(int a[])
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
	
	
	public static int findCube(int n){  
        return n*n*n;  
    }  
	
}
