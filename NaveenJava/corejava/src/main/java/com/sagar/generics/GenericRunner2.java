package com.sagar.generics;

public class GenericRunner2 {

	public static void main(String[] args) {
		MyCustomList2<String> list1= new MyCustomList2<>();
		list1.addElement("element 1");				
		list1.addElement("element 2");
		String value1 = list1.get(0);
		System.out.println("value1 : "+value1);
		
		
		MyCustomList2<Integer> list2= new MyCustomList2<>();
		list2.addElement(Integer.valueOf(5));				
		list2.addElement(Integer.valueOf(7));
		Integer value2 = list2.get(1);
		
		System.out.println("value2 : "+value2);

	}

}
