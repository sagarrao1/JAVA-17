package com.sagar.intrface;

interface Computer {
	 void code();
}

class Laptop implements Computer{
	public void code() {
		System.out.println("code , compile, run using laptop");
	}
}

class Desktop implements Computer{
	public void code() {
		System.out.println("code , compile, run using Desktop");
	}
}
class Developer {
	public void devApp(Computer comp){
		comp.code();
	}
}

//
//class Developer {
//	public void devApp(Computer comp) {
//		comp.code();
//	}
//}

public class NeedOfInterfaceDemo {
	public static void main(String[] args) {		
		Computer lap = new Laptop(); 
		Computer desk = new Desktop();
		
		Developer sagar= new Developer();	
		sagar.devApp(desk);
	}
}
