package com.sagar.collections.CollectionGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleBraceDemo {
	public static void main(String[] args) {
		
		// Different ways of passing values
		/*// 1st way
		 * List<Integer> values=new ArrayList<>();		 * 
		 * values.add(7); 
		 * values.add(9); 
		 * values.add(8);
		 */
		
		 // 2n way
		//List<Integer> values=  Arrays.asList(7,9,8);
		
		// 3 way using Annonymous class and double braces
		List<Integer> values=new ArrayList<Integer>()
				{{	
					add(7); 
					add(9); 
					add(8); 
				}};
		
				
		for (Integer i : values) {
			System.out.println(i);
		}
		
	}

}
