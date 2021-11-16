package com.main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
/**
 * 
 * @author mounika.kuna
 *
 */
public class Practice {
	public static void main(String[] args) {
		Date date = new Date();  
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		String strDate= formatter.format(date);  
		System.out.println(strDate);  
		    
		//practice1
		LocalDate dat = LocalDate.now();    
	    LocalDate yesterday = dat.minusDays(1);    
	    LocalDate tomorrow = yesterday.plusDays(2);    
	    System.out.println("Today date: "+dat);    
	    System.out.println("Yesterday date: "+yesterday);    
	    System.out.println("Tomorrow date: "+tomorrow+"\n");    
		
	    //practice2
		LocalDate date1 = LocalDate.of(2017, 1, 13);    
		System.out.println(date1.isLeapYear());    
		LocalDate date2 = LocalDate.of(2016, 9, 23);    
		System.out.println(date2.isLeapYear());    
		
		//practice3
        String dInStr = "2011-09-01";  
        LocalDate d1 = LocalDate.parse(dInStr);  
        System.out.println("String to LocalDate : " + d1);  
	}    
}    
	

