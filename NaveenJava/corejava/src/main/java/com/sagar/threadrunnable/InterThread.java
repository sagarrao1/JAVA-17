package com.sagar.threadrunnable;

class Q{
	int num;
	boolean valueSet =false;

	public synchronized void getNum() {
		
		while(! valueSet) {
			try { 	wait(); } catch (InterruptedException e) { System.out.println(e);	}
		}
			System.out.println("Get : "+ num);
		valueSet=false;
		notify();	
	}
	
	public synchronized void setNum(int num) {
		while(valueSet) {
			try { 	wait(); } catch (InterruptedException e) { System.out.println(e);	}
		}
		this.num = num;
		System.out.println("Put : "+this.num);
		valueSet=true;
		notify();
	}	
}

class Producer implements Runnable
{
	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t1= new Thread(this,"Producer");
		t1.start();
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			q.setNum(i++);
			try {  Thread.sleep(500); 	} catch (InterruptedException e) { System.out.println(e);				
			}
		}		
	}	
}


class Consumer implements Runnable
{
	Q q;

	public Consumer(Q q) {
		this.q = q;		
		Thread t2= new Thread(this,"Consumer");
		t2.start();
	}
	@Override
	public void run() {
		while(true) {
		   q.getNum();
		   try {  Thread.sleep(3000); 	} catch (InterruptedException e) { System.out.println(e);	}		
	}	
 }
}

public class InterThread {
	public static void main(String[] args) {
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
		

	}
}
