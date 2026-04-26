package com.sagar.collections.CollectionGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionTuto {
	public static void main(String[] args) {
		
		List<Integer> values= new ArrayList<>();
		
		values.add(2);
		values.add(25);
		values.add(6);
		values.add(77);
		values.add(99);	
		values.add(1, 101);
		
		//to sort List
		Collections.sort(values);
		Collections.reverse(values);
		//values.remove(6);
		
		//old way
		/*Iterator i= values.iterator();		
		while(i.hasNext()) {
			System.out.println(i.next());*/
		
		for (Integer o : values) {
			System.out.println(o);
		}
	}
}
