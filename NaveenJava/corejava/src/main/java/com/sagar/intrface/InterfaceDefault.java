package com.sagar.intrface;

// 1.8 we can define methods in interface using default keyword

interface I {
	void add();

	default void show() {
		System.out.println(" I Show");
	}

	static void display() {
		System.out.println("static display method");
	}
}

interface J {
	default void show() {
		System.out.println(" J Show");
	}
}

class AB {
	public void show() {
		System.out.println("AB show");
	}
}

class D extends AB implements I, J {
	public void add() {
		System.out.println("add");
	}
	
//	  public void show() { System.out.println(" D show"); }
	
}
	 

public class InterfaceDefault {
	public static void main(String[] args) {
		I.display();
		I obj=new D();
		obj.add();
		obj.show();

	}
}
