package com.sagar.intrface;
// Marker interface will not have any methods
// used to check permission or save state of objects
//exmple of Market interface are serilizable, remote

class MrImpl implements Mr{
	public void show() {
		System.out.println("Hello");
	}
}
public class MarkerInterface {
	public static void main(String[] args) {		
		MrImpl obj=new MrImpl();
		if( obj instanceof Mr)	{
		obj.show();
		}else {
			System.out.println("No permission");
		}
	}

}
