package com.sagar.collections.CollectionGenerics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> values=new /*HashSet*/TreeSet<Integer>();  // TreeSet will sort by default
		
		values.add(5);
		values.add(62);
		values.add(97);
		values.add(5);  // set will not store duplicate value and not retrive in sorting order
								// to store in sort order we need to use TreeSet 
		
		System.out.println(values.add(5));
		System.out.println(values.add(8));  //add method return boolean
		
		// comparator or comparable will support on List type not Set type
				
		for (Integer i : values) {
			System.out.println(i);
		}
		System.out.println("================");
		Set<String> friends=new /*HashSet*/TreeSet<>();  // TreeSet will sort by default
		
		friends.add("Sagar");
		friends.add("Ravi");
		friends.add("Sanju");
		friends.add("Mahesh");  // set will not store duplicate value and not retrive in sorting order
								// to store in sort order we need to use TreeSet 
		
		
		// comparator or comparable will support on List type not Set type
				
		for (String s : friends) {
			System.out.println(s);
		}
	}
}
