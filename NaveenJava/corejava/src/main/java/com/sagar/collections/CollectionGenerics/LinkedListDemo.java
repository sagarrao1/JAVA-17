package com.sagar.collections.CollectionGenerics;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		List<Integer> values= new LinkedList<>();
		
		values.add(2);
		values.add(25);
		values.add(6);
		values.add(77);
		values.add(99);
		
		//to sort List
		Collections.sort(values);
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
