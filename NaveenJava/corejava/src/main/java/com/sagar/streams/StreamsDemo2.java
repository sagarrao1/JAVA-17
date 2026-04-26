package com.sagar.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamsDemo2 {
	public static void main(String[] args) {
		List<Integer> nums= Arrays.asList(1,2,3,4,5,6);		
		

		Predicate<Integer> pred=  new Predicate<Integer>() {			
			@Override
			public boolean test(Integer n) {
				if (n%2==0)
					return true;
				else 
					return false;
			}
		};
		
//		simplified versions of Predicate
		
//		Predicate<Integer> pred=  (Integer n) -> {
//				if (n%2==0)
//					return true;
//				else 
//					return false;
//		};
		
//		Predicate<Integer> pred=  (Integer n) -> { return (n%2==0) ? true:false; };
		
//		Predicate<Integer> pred=  (Integer n) -> (n%2==0) ? true:false;
		
//		Predicate<Integer> pred=  n -> (n%2==0);
	
		Integer result = nums.stream()
							.filter(pred)
//							.filter(n -> n%2==0)
							.map(n -> n*2)
							.reduce(0, (c,e)-> c+e);
				
		System.out.println(result);
	
	}
}
