package com.sagar.collections.CollectionGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatePrint {
	public static void main(String[] args) {
		// Print duplicate values in collection
		/*
		 * ArrayList<String> values = new ArrayList<String>(); values.add("Sagar");
		 * values.add("Raju"); values.add("Sagar"); values.add("Naresh");
		 * values.add("Sanju"); values.add("Raju");
		 */	
		
		List<String> values= Arrays.asList("Sagar","Raju","Sagar","Naresh","Sanju","Raju");
		Set<String> s=new HashSet<>();		
		
		System.out.println("Duplicate Name is");
		for (String name : values) {
			if (s.add(name) == false)
			System.out.println(name);
		}		
		
	}
}
