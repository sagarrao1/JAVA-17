package com.sagar.generics;

import java.util.ArrayList;

public class MyCustomList<T> {

	private ArrayList<T> list= new ArrayList<>();

	public void addElement(T element) {
		list.add(element);
	}

	public T get(int index) {
		return list.get(index);
	}

	public void remove(T element) {
		list.remove(element);
		System.out.println("element removed at element: "+element);
	}
}
