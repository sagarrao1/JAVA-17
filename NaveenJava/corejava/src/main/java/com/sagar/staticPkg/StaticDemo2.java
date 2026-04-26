package com.sagar.staticPkg;

class A{
	int num1;
	static int num2;
	
	public static void increment() {
		num2++;
	}
}
public class StaticDemo2 {
	public static void main(String[] args) {
		A.num2=5;
		System.out.println(A.num2);
		
		A obj1=new A();
		A obj2=new A();
		A obj3=new A();
		obj1.increment();
		System.out.println(A.num2);
		obj1.num1=2;
		obj2.num1=3;		
		obj3.num1=4;
		obj2.increment();
		obj3.increment();
		System.out.println(A.num2);
		
	}
}
