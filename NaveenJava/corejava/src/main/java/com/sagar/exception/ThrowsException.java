package com.sagar.exception;
// throws is used to suppress the exception without handling it
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class ThrowsException {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc= new Scanner(System.in);
		int i = 8,j,k=0;
		 try {
			System.out.println("Enter a number");
			//j = Integer.parseInt(br.readLine());
			j= Integer.parseInt(br.readLine());
			k = i + j;
			System.out.println("k value is: "+ k);		
			
			if (k<10) {
				throw new ArithmeticException();
			}
		 } catch (ArithmeticException e) {
			 System.out.println(" Minimum value of result k shoud be 10  :"+e);
		 }catch (Exception e) {
			 System.out.println(" unknow exception "+e);
		 }
		 finally {
			 System.out.println("Finally close");
			 br.close();
		 }
	}

}
