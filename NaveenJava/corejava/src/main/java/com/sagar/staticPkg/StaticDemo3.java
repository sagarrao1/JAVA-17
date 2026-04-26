package com.sagar.staticPkg;
// Count number of Objects in class

class B{
	static int i=0;
	public B() {
		i++;
	}
	
	public void counter() {
		System.out.println(i);
	}
}

public class StaticDemo3 {
	public static void main(String[] args) {
		B obj1=new B();
		B obj2=new B();
		obj1.counter();
		B obj3=new B();
		obj2.counter();
  }
}
