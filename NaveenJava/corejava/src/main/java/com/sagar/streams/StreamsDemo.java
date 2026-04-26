package com.sagar.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamsDemo {
	public static void main(String[] args) {
		List<Integer> nums= Arrays.asList(1,2,3,4,5,6);		
				
//		Stream<Integer> s1= nums.stream();
//		Stream<Integer> s2 = s1.filter(n -> n%2==0);
//		Stream<Integer> s3 = s2.map(n -> n*2);
//		Integer result = s3.reduce(0, (c,e)-> c+e);
		
		Integer result = nums.stream()
							.filter(n -> n%2==0)
							.map(n -> n*2)
							.reduce(0, (c,e)-> c+e);
				
		System.out.println(result);
		
		
//		s3.forEach(n -> System.out.println(n));
		
//		s1.forEach(n -> System.out.println(n));
//		s1.forEach(n -> System.out.println(n)); // will give runtime error saying stream is already used
		
//		now nums are different and s1 is different. s1 is stream
//		once you use stream , you can't resuse same stream
//		stream is like flow of water in river. once the water passes you. you can't touch same water again
		
//****************foreach Consumer Object steps starts.....................		
//		nums.forEach(n -> System.out.println(n));
//		forEach accepts Coonsumer Object
//		Consumer is a functional interface. it has one method called void accept(T t) which we need to implement
				
//		Consumer<Integer> con = new Consumer<Integer>() {
//			
//			@Override
//			public void accept(Integer n) {
//				System.out.println(n);				
//			}
//		};
		
//		Consumer<Integer> con = (Integer n) -> {
//				System.out.println(n);				
//		};

//		Consumer<Integer> con = (Integer n) -> System.out.println(n);				
		
//		Consumer<Integer> con = n -> System.out.println(n);		
//		nums.forEach(con);

//		nums.forEach(n -> System.out.println(n));
//*************foreach Consumer Object steps ends.....................
		
		
//		for (Integer integer : nums) {
//			System.out.println(integer);
//		}	
		
		
//		int sum=0;
//		for (int i = 0; i < nums.size(); i++) {
//			if ( (nums.get(i)) %2==0) {
//				sum = (nums.get(i)*2)+ sum; 
//			}
//		}
//		System.out.println("Sum :" +sum);
		
		
		
		
	}

}
