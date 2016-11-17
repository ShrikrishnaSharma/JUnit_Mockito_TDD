package com.tm.mock;


import java.util.List;

import org.junit.Test;

import static org.mockito.Mockito.*;



public class MockList {
	
	
	public static void main(String gg[])
	{
		List mockedList=mock(List.class);
		mockedList.add("one");
		mockedList.add("two");
		mockedList.add("three");
		mockedList.clear();
		
		
		
		when(mockedList.get(0)).thenReturn("first");
		
		System.out.println(mockedList.get(0));
		
		System.out.println(mockedList.get(400));
		
		
		

}
}
