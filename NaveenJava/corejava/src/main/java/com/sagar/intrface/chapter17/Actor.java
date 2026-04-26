package com.sagar.intrface.chapter17;

public interface Actor {
	void act();
	void speak();
	default void comedy() {
		System.out.println("I can make people laugh");
	}
}
