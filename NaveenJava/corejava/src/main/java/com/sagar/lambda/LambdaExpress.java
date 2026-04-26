package com.sagar.lambda;

public class LambdaExpress {

	public static void main(String[] args) {		
	/*	B obj=new B() {			
				public void show() {
					System.out.println("Hello this is annoymous show");
				}			
		}; */
		
		B obj= () -> System.out.println("Hello this is annoymous show using lambda express");
		
		obj.show();
	}
}
