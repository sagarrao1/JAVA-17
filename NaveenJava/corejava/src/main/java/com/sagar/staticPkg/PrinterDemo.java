package com.sagar.staticPkg;

class Paper {
	String text;

	public void setText(String s) {
		text = s;
	}

	public String getText() {
		return text;
	}
}

class Printer {
	public void print(Paper d) {
		d.setText("Get lost");
	}
}

public class PrinterDemo {
	public static void main(String[] args) {
		Paper p =new Paper();
		p.setText("Hello world");
		System.out.println(p.getText());
		
		Printer hp=new Printer();
		hp.print(p);
		System.out.println(p.getText());
	}
}
