package com.sagar.intrface.chapter17;

import java.util.Arrays;
import java.util.List;

// I want to find values divide by 5 and sum all of those and give me result
public class StreamFilterDemo {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12, 20, 30, 35, 58, 55, 76, 75);

		//Normal way
		int result = 0;
		for (Integer i : values) {
			if (i % 5 == 0) {
				result = i*2;
				break;
			}
		}
		System.out.println(result);

		// Using Streams
		System.out.println(values.stream()
											   //.filter(i -> i % 5 == 0)
												.filter(StreamFilterDemo::isDivisible)
											   //.map(i -> i*2)
												.map(StreamFilterDemo::mapDouble)
											   //.reduce(0, (c, e) -> c + e)
											   .findFirst()
											   .orElse(0)
				           );
		}
	
	public static boolean isDivisible(int i) 
	{
		System.out.println("In isdiv "+ i);
		return i%5==0;
	}

	public static int mapDouble(int i) 
	{
		System.out.println("In map double "+ i);
		return i*2;
	}
}
