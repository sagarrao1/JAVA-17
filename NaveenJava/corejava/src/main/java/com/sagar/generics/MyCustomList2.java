package com.sagar.generics;

import java.util.ArrayList;

public class MyCustomList2<T> {
	ArrayList<T> list =  new ArrayList<>();
		
	public void addElement(T element) {
		list.add(element);
		System.out.println("added "+element);
	}
	
	public void removeElement(T element) {
		list.remove(element);
		System.out.println("removed "+element);
	}

	public T get(int n) {
		return list.get(n);
	}

}
