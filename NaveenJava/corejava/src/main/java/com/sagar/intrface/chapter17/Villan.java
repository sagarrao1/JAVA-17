package com.sagar.intrface.chapter17;

public class Villan implements Actor {

	@Override
	public void act() {
		System.out.println("I can act");

	}

	@Override
	public void speak() {
		System.out.println("I can speak");

	}

	public static void main(String[] args) {
		Villan v= new Villan();
		v.act();
		v.speak();
	

	}

}
