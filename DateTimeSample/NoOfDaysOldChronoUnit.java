package com.java.DateTimeSample;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NoOfDaysOldChronoUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate now = LocalDate.now();   
	    System.out.println("now: " + now);
	    
	    LocalDate date1 = LocalDate.of(2019, 9, 25);
	    long day1 = ChronoUnit.DAYS.between(now, date1);
	    
	    System.out.println(date1);
	    System.out.println(day1);
	    
	    
	    LocalDate date2 = LocalDate.of(2021, 2, 25);
	    long day2 = ChronoUnit.DAYS.between(now, date2);
	    
	    System.out.println(date2);
	    System.out.println(day2);
	 
	  }
	    
	}


