package com.sagar.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamsDemo3 {
	public static void main(String[] args) {
		List<Integer> nums= Arrays.asList(1,2,3,4,5,6);		
		
		Function<Integer, Integer> fun = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				return t*2;
			}
		};

//		Simplified versions of function
		
//		Function<Integer, Integer> fun = (Integer t) -> {
//				return t*2;
//		};
		
//		Function<Integer, Integer> fun = (Integer t) -> {return t*2; };
		
//		Function<Integer, Integer> fun = t -> t*2;
		
		Integer result = nums.stream()
							.filter(n -> n%2==0)
							.map(fun)
//							.map(n -> n*2)
							.reduce(0, (c,e)-> c+e);
				
		System.out.println(result);
	
	}
}
