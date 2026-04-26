package com.sagar.collections.CollectionGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class ConsImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
 }	
}

// External for loops
// Internal for loops for collection in Java 8
public class LambdaForEach {

	public static void main(String[] args) {
		List<Integer> values= Arrays.asList(3,8,45,39,6);
		/*
		 * List<Integer> values= new ArrayList<>(); values.add(5); values.add(1);
		 * values.add(83); values.add(7); values.add(9);
		 */
		Collections.sort(values);
		// 1st way to get elements from collection
		/*for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));
		}*/
		
		// 2nd way to get values from collection forEach
		/*for (Integer k : values) {
			System.out.println(k);
		} */

		// 3way anonymous class
		/*Consumer<Integer> c = new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t);
			}				
		}; */	
		
		//Consumer<Integer> c = t -> System.out.println(t);		  // Lambda Expression with Consumer interface	
		
		//values.forEach(c);
		
		  values.forEach( t -> System.out.println(t));
		
				
		//values.forEach(i -> System.out.println(i));
		
	}
}
