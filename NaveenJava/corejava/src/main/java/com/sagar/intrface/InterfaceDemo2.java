package com.sagar.intrface;

interface Abc{
	void show();
}
interface yyy{
	
}
interface xyz extends Abc,yyy{  // interface supports extending multiple interfaces
	//  we use implement to define interface
	// we use extend to inherit the interface with another interface
}
// we are creating interface above and creating instance of interface
public class InterfaceDemo2 {
	public static void main(String[] args) {

//	1. using Anonyman class
//		Abc obj = new Abc() {
//			@Override
//			public void show() {
//				System.out.println("Anonymas object show");
//			}
//		};

//	2. sing Anonyman class with Lambda expression
		Abc obj = () -> System.out.println("Anonymas object show");
		obj.show();
	}


//		Abc obj=() -> System.out.println("Anonymas object show....");
//		obj.show();
}
/* by defalut interface methods are public and abstract
 *  Interfaces are of 3 types
 *  SAM --> single Abstract method like below  -- also called funtional interface in java 8
 *  normal --> normal interface like multiple declared methods
 *   Marker interface --> interface without any methods
 */
/*
 * class AbcImpl implements Abc{ // whole purpose if this is to implement method. there is another way to do this. so commented this
 * declared interface Abc
 * 
 * @Override public void show() { System.out.println("In Show ...."); } }
 */