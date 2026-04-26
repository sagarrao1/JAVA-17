package com.sagar.staticPkg;

class Ab{
	static int  i=5;
	public static void show()
	{
		System.out.println("Hello");
		System.out.println(i);
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		//Ab obj=new Ab();		
		Ab.show();		
		System.out.println(Ab.i);
	}
}

