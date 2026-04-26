package com.sagar.lambda;

/*interface Mobile{
	String APPLE="Apple";
	String SAMSUNG="Samsung";
	String HTC="Htc";
}*/

// we can create variables and methods
/*
 * class Mobile{ * 
   static final Mobile APPLE=new Mobile();
   static final Mobile SAMSUNG=new Mobile();
   static final Mobile HTC=new Mobile();  
   }
 */
enum Mobile{
	APPLE(100),SAMSUNG,MI(80);
	
	int price;

	// we can create constructor
	Mobile()
	{
		price=80;
		System.out.println("constructor");
	}
	Mobile(int p){
		price=p;
		System.out.println("parametized constructor");
	}
	public int getPrice() {
		return price;
	}
}

public class EnumDemo {

	public static void main(String[] args) throws ClassNotFoundException {
//		Class.forName("com.sagar.lambda.Mobile");
		System.out.println();
		System.out.println(Mobile.APPLE.getPrice());
		System.out.println(Mobile.SAMSUNG.ordinal());

		Mobile m[]=Mobile.values();

		for (Mobile mobile : m) {
			System.out.println(mobile + " : "+ mobile.getPrice());
		}
			
	}
} 