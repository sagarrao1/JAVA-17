package com.sagar.collections.CollectionGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CompImpl implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1%10>o2%10)
			return 1; // swap
		
		return  -1; // don't swap	
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		List<Integer> values= new ArrayList<>();		
		values.add(267);
		values.add(254);
		values.add(600);
		values.add(773);
		values.add(996);
		values.add(335);
		
		// I want sort based on last digit of each number
		// if we want to use customized sorting , we need to pass Object of comparator interface sort method of collections class
		// that interface object will have logic of customized sorting
		/*
		 * Comparator<Integer> comp=new Comparator<Integer>() { public int
		 * compare(Integer o1, Integer o2) { if(o1%10>o2%10) return 1; // swap
		 * 
		 * return -1; // don't swap }
		 * 
		 * };
		 */		
		
		/*Comparator<Integer> comp= ( o1,  o2) ->  // Lambda expression with comparator interface
		{ 
			//return o1%10>o2%10?1:-1;
			
			 * if(o1%10>o2%10) return 1; //  swap
			 * 
			 * return -1; // don't swap
			 			} ; */
		
			// Lambda expression with comparator interface
			 //Comparator<Integer> comp= ( o1,  o2) ->  	{ return o1%10>o2%10?1:-1; } ;
			 
		Collections.sort(values, ( o1,  o2) ->  	{ return o1%10>o2%10?1:-1; } );
		//Collections.sort(values);		
		//Collections.reverse(values);
		
		for (Integer i : values) {
			System.out.println(i);
		}
	}

}
