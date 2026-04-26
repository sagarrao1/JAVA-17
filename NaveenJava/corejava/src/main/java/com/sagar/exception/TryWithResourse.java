package com.sagar.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
// try block with resourse in java 1.7 on wards
public class TryWithResourse 
{
	public static void main(String[] args)  throws Exception
	{
		//BufferedReader br = null;
		String str;				
		try (BufferedReader br= new BufferedReader(new InputStreamReader(System.in)))
		{
			//br= new BufferedReader(new InputStreamReader(System.in));
			str= br.readLine();
			System.out.println(" eneter value is "+str);
		} /*
			 * catch (IOException e) { // TODO Auto-generated catch block
			 * System.out.println(" user exception "+e); } finally {
			 * System.out.println("Finally Bye.."); br.close(); }
			 */

	}

}
