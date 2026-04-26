package com.sagar.collections.CollectionGenerics;

interface A {
	void show(int i);
	
	// Java 8 feature. you can define methods in interface
	default void call() {
		System.out.println("Callling");
	}
}

class XYZ implements A {

	@Override
	public void show(int i) {
		System.out.println("Hello "+i);

	}

}

public class LambdaDemo {	
	public static void main(String[] args)  {
		// old way
		 // A obj; obj=new XYZ(); 
		 		
		/* using annoymous class with out creating new class which implementing interface
		A obj = new A() {
			public void show(int i) {
				System.out.println("Hello"+i);
			}
		}; */
		
		// Lambda Expression
		A obj= (int i) -> System.out.println("Hello "+i);
		 	
		obj.show(6);
		obj.call();
	}
}
