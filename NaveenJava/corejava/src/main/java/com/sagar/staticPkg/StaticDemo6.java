package com.sagar.staticPkg;

class Mobile {

	private String brand;
	private int price;
	static String name;
	
	static {
		name="Phone";
		System.out.println("In static block");
	}

	public Mobile(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
		System.out.println("In Constructor");
	}

	public void show() {
		System.out.println(brand + " : " + price + " : " + name);
	}
}

public class StaticDemo6 {
	public static void main(String[] args) throws ClassNotFoundException {
//		Mobile obj= new Mobile("apple", 1500);
//		obj.show();
//		Mobile obj1= new Mobile("oppo", 1000);
//		obj1.show();
		
		Class.forName("com.sagar.staticPkg.Mobile");
//		System.out.println(Mobile.name);
	}

}
