package com.sagar.intrface.chapter17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class DateTimeDemo {

	public static void main(String[] args) throws ParseException {
		/*
		 * String sDate1="31/12/1998"; SimpleDateFormat format1= new
		 * SimpleDateFormat("dd/mm/yyyy"); Date d1= format1.parse(sDate1);
		 * System.out.println(sDate1+"\t"+d1);
		 */	 
		 
		 LocalDate d= LocalDate.of(1979, 9, 29);
		 LocalDate d1=LocalDate.now();
		 
		 Period p= Period.between(d, d1);
		    int years = p.getYears();
		    int months = p.getMonths();
		    int days = p.getDays();
		 
		    String output = p.toString() ;
		 
		 System.out.println(p);
		 System.out.println(years+" years "+months+" months "+days+" days ");
		 
		 
		 
	}

}
