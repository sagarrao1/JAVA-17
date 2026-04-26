package com.sagar.staticPkg;
/* Constructors are
 * 1.member methods of class
 * 2.will have same name as class
 * 3.will not return anything
 * 4. it will be used to allocate memory.
 * 5. constructors are overloaded with no.of parameters
 * 6. it will have deafult constructor if you did not specify
 */

class Construct{	
	int num1;
	int num2;	
	String s;
	
	//constructor
	public  Construct() {
		num1=5;
		num2=5;
		s="nothing";
		System.out.println("in Default constructor");
	}
	//parameterised constructor
	public  Construct(int i) {
		num1=i;
		num2=i;		
		s="nothing";
	}
	
	public  Construct(double d,int n) {
		num1=(int) d;
		num2=n;
		s="nothing";
	}
	public  Construct(int n1,int n2) {
		num1=n1;
		num2=n2;
		s="nothing";
	}
	public  Construct(double d,int n,String str) {
		num1=(int) d;
		num2=n;
		s=str;
	}
}

public class ConstructorDemo {
	public static void main(String[] args) {		
		  Construct obj=new Construct(9.5,8);
		  
		  System.out.println("obj num1: "+obj.num1);
		  System.out.println("obj num2: "+obj.num2);
		  
		  obj=new Construct(9.5,8,"Sagar");
		  
		  System.out.println("obj num1: "+obj.num1);
		  System.out.println("obj num2: "+obj.num2);
		  System.out.println("obj String: "+obj.s);

		obj=new Construct(5,3);
		System.out.println("obj num1: "+obj.num1);
		System.out.println("obj num2: "+obj.num2);

	}

}
