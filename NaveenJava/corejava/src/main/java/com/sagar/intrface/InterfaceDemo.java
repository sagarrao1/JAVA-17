package com.sagar.intrface;

interface A
{
	/* public abstract */ void show(); // not required by deafult interface methods are  public and abstract
}

class C implements A{		
	public void display() {
		System.out.println("Hi");		
	}
	
	@Override
	public void show() {
		System.out.println("Hello");
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new C();
		obj.show();
		//obj.display();  // you are restricting not to use other methods of class by using reference variable of Interface A obj
	}
}

