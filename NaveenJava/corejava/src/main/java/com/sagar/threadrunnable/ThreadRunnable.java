package com.sagar.threadrunnable;

public class ThreadRunnable {
	public static void main(String[] args) throws InterruptedException {

//		 Runnable obj1 = () -> {
//					for (int i = 0; i < 10; i++) {
//						System.out.println("Hi");		
//						try {
//							Thread.sleep(10);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
//			};

		Runnable obj2 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, "Thread Hi");

		Thread t2 = new Thread(obj2);

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("2 Threads completed.............");
	}
}

//class A implements Runnable
//{
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Hi");		
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}

//class B implements Runnable
//{
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Hello...");
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}	
//	}
//}
