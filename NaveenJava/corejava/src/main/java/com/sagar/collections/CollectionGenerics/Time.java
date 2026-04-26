package com.sagar.collections.CollectionGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Time {

	public static void main(String[] args) {
		// CurrentMilliseconds Demo
		//  the time value that we get is number of milliseconds from Jan 1st 1970
		System.out.println(System.currentTimeMillis());
		ArrayList<Integer> values=new ArrayList<Integer>();
		Random r= new Random();
		
		long start=System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			values.add(r.nextInt(1000));
		}
		Collections.sort(values);
		long end=System.currentTimeMillis();
		values.remove(8);
		for (Integer a : values) {
			System.out.println(a);
		}
		System.out.println("Time taken in milliseconds: "+(end-start));
	}

}
