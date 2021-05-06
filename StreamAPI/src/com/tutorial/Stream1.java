package com.tutorial;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) throws IOException
//	{
//		
//		//1. INT stream
//		
//		IntStream
//			.range(1, 10)
//			.forEach(System.out::println);
//	}	
//	{
//		//2. Int Stream with Skip
//		IntStream
//		.range(1, 10)
//		.skip(4)
//		.forEach(x ->System.out.println(x));
//	}
	
//	{
//		//3. Int Stream with sum
//		System.out.println(
//		IntStream
//			.range(1, 11)
//			.sum()
//						   );
//	}
	
//	{	
//		//4. Stream.of, Sorted and findfirst
//		Stream.of("Ashwin", "Karan", "Ankit", "Ashish")
//			.sorted()
//			.findFirst()
//			.ifPresent(System.out::println);
//	}
	{
		//5. Stream from Array, Sort, filter and Print
		String[] names= {"Ankit","Ankush","Raj","Shiv","Anveshi", "Ashu", "Aman", "Karan"};
		Arrays.stream(names)
			.filter(x->x.startsWith("A"))
			.sorted()
			.forEach(System.out::println);
	}
	
}
