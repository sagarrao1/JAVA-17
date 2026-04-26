package com.sagar.annotation;

public class AnnonymousDemo {
	public static void main(String[] args) {		
		BB obj=new BB() {
				public void show() {
					System.out.println("Hello this is annoymous show");
				}			
		};
		obj.show();
	}
}

class BB{
	public void show() {
		System.out.println("Hello this is B show");
	}
}

/*
 * class C extends B{ public void show() {
 * System.out.println("Hello this is C show"); } }
 */