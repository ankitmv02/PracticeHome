package com.tutorial;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Stream2 {
	public static void main(String[] args) throws IOException
//	{	
//		//6. Average of squares of an int array
//		Arrays.stream(new int[] {2,4,6,8,10})
//			.map(x->x*x)
//			.average()
//			.ifPresent(System.out::println);
//	}
	{
		//7. Stream from LIST, filter and Print
		List<String> plist=Arrays.asList("Ankit","Akshay","Karan","Krish","Ajinkya","Rajat");
		plist
			.stream()
			.map(String::toLowerCase)
			.filter(x->x.startsWith("a"))
			.forEach(System.out::println);
	}
}
