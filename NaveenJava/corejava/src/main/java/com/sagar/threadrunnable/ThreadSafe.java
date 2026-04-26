package com.sagar.threadrunnable;

class Counter{
	int num;	
	public  synchronized   void increment() {
		num++;
	}
}

public class ThreadSafe {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		
		A obj1 = new A(c);
		B obj2 = new B(c);
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(" Num : "+c.num);
	}
}

class A implements Runnable
{	
	Counter c;
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			c.increment();
//			System.out.println("increment :"+i);
		}
	}

	public A(Counter c) {
		super();
		this.c = c;
	}	
	
}

class B implements Runnable
{
	Counter c;
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			c.increment();
		}	
	}
	
	public B(Counter c) {
		super();
		this.c = c;
	}	
}
