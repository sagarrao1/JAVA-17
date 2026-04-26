package com.sagar.staticPkg;

class Thing {
	public String name;
	public static String description="This is static description";

}

public class ThingDemo{
	public static void main(String[] args) {
		Thing thing1= new Thing();		
		thing1.name="Sagar";
		System.out.println(Thing.description);
		System.out.println(thing1.name);
	}
}
