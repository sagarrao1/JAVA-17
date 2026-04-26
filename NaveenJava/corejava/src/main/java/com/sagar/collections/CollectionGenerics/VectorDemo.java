package com.sagar.collections.CollectionGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {

		List<Integer> v = new ArrayList<Integer>();
		v.add(64);
		v.add(44);
		v.add(55);
		v.add(2);
		v.add(6);
		v.add(9);
		v.add(10);
		v.add(4);
		v.add(4);
		/*
		 * Vector<Integer> v =new Vector<Integer>(); v.add(4); v.add(5); v.add(64);
		 * v.add(44); v.add(55); v.add(2); v.add(6); v.add(9); v.add(10); v.add(4);
		 * v.add(4); Collections.sort(v); System.out.println(v.capacity());
		 */
		System.out.println(v.size());
		for (Integer i : v) {
			System.out.println(i);
		}

	}

}
