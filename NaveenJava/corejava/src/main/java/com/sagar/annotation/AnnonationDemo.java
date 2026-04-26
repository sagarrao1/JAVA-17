package com.sagar.annotation;

import java.util.ArrayList;

@FunctionalInterface
interface Ann{
	public void abc();	
}
class C{
	public void showforcallingDatabase() {
		System.out.println(" In C");
	}
}

class D extends C{
	@Override
	@SuppressWarnings("unchecked")
	public void showforcallingDatabase() {
		System.out.println(" In D");		
		ArrayList v=new ArrayList();
	}
	
	@Deprecated
	public void show() {
		
	}
}

public class AnnonationDemo {
	public static void main(String[] args) {
		D obj=new D();
		obj.showforcallingDatabase();
		
		obj.show();
	}

}
