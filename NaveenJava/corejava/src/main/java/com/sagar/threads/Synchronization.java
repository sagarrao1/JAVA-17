package com.sagar.threads;

class Counter{
	int num;
	public  synchronized  void increment() {
		num++;
	}
}

class T1 extends Thread {
	  Counter c;
		T1(Counter c){
			this.c=c;
		}
	public void run( ) {
		for (int i = 0; i < 1000; i++) {
			c.increment();
		}		
	}
}

class T2 extends Thread {			
	
	Counter c;
	
	public T2(Counter c) {
		this.c = c;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			c.increment();
		}
		
	}
}

public class Synchronization {
	public static void main(String[] args) throws Exception {
		Counter c= new Counter();
		
		T1 obj1=new T1(c);
		T2 obj2=new T2(c);
		/*
		 * Thread t1=new Thread(new Runnable() {
		 * 
		 * @Override public void run() { for (int i = 0; i < 1000; i++) { c.increment();
		 * }
		 * 
		 * } });
		 * 
		 * Thread t2=new Thread(new Runnable() {
		 * 
		 * @Override public void run() { for (int i = 0; i < 1000; i++) { c.increment();
		 * }
		 * 
		 * } });
		 */		
		/*
		 * t1.start(); t2.start(); t1.join(); t2.join();
		 */
		
		obj1.start();
		obj2.start();
		obj1.join();
		obj2.join();
		System.out.println(" Num : "+c.num);

	}

}
