package com.sagar.threads;

public class ThreadDemo {

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        
        obj1.start();
        obj2.start();
    }
}

class A extends Thread
{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hi");		
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread
{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello...");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
