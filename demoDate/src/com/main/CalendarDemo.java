package com.main;

import java.util.Calendar;
/**
 * 
 * @author mounika.kuna
 *
 */
public class CalendarDemo {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("The current date is : " + calendar.getTime());  

		System.out.println(calendar.getWeekYear());
		System.out.println(calendar.getCalendarType());
		System.out.println(calendar.getTime());

		calendar.add(Calendar.DATE, -15);  
		System.out.println("15 days ago: " + calendar.getTime());  

		calendar.add(Calendar.MONTH, 4);  
		System.out.println("4 months later: " + calendar.getTime());  

		calendar.add(Calendar.YEAR, 2);  
		System.out.println("2 years later: " + calendar.getTime());  
	}
}
