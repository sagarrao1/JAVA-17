package com.sagar.exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		int i=2,j=2,k=0;
		int a[]=new int[4];
		
		try {
			k=i/j;
			for( int p=0;p<=4;p++) {
				a[p]= p+1;
			}
			for (int value : a) {
				System.out.println(value);
				
			}
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("Can't divide by zero: "+e);
		}catch (ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println("Max value is 3 only: "+e);
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("unknown exception"+e);
		}
		
		System.out.println("After catch block k is "+k);		

	}

}
