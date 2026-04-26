package com.sagar.staticPkg;

public class StaticDemo4 {
	// static methods are executed before main
	// they are accessable to all objects, not belong to any object
	//static block executed before classs is loaded i.e before main is called
	static String s;
	static {
		//System.out.println("Hello static");
		s="Hello world";
	}
	
	public static void main(String[] args) {
		System.out.println("value of s is : "+s);
	}
	
	static {
		System.out.println("static 2");
	}

}
