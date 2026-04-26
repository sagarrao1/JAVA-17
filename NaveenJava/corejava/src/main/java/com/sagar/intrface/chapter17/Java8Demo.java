package com.sagar.intrface.chapter17;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Demo {
	public static void main(String[] args) {
		List<Integer> values= Arrays.asList(1,2,3,4,5,6);
		
		//1. Anonymous class
		/*Consumer<Integer> c=new Consumer<Integer>() {
			public void accept(Integer t) {				
				System.out.println(t);				
			}			
		};
		c.accept(8);*/

//		2. Lambda expression
//		Consumer<Integer> c=t  -> System.out.println(t);
//		c.accept(9);

//		3. Method reference
//		Consumer<Integer> c= System.out::println;
//		c.accept(9);

		/*
		 * values.forEach(new Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer t) { System.out.println(t); } });
		 */
		
//		values.forEach( t -> System.out.print(t+" "));
//		values.forEach( System.out::doubleIt(t));
//		values.forEach( t -> doubleIt(t));
		values.forEach( Java8Demo::doubleIt);
		
	}
	
	public static void doubleIt(int i) {
		System.out.println(i*2);
	}

}
