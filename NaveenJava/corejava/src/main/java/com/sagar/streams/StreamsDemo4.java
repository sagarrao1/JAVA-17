package com.sagar.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamsDemo4 {
	public static void main(String[] args) {
		List<Integer> nums= Arrays.asList(1,2,3,4,5,6);		
		
		
		Integer result = nums.stream()
							.filter(n -> n%2==0)
							.map(n -> n*2)
							.reduce(0, (c,e)-> c+e);
				
		System.out.println(result);
	
	}
}
