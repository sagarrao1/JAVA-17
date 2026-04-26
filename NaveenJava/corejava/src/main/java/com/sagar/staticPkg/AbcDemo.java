package com.sagar.staticPkg;

public class AbcDemo {
	public static void main(String[] args) {
		Abc obj=new Abc(7);

	}
}

class Abc{
	int num;
	
	public Abc() {
		System.out.println("Default one");
	}
	public Abc(int i) {
		System.out.println("parametrised int constructor");
	}
	/*
	 * public Abc(double i) { System.out.println("parametrised double constructor");
	 * }
	 */

}
