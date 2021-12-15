package com.java.DateTimeSample;

import java.time.LocalDate;
import java.time.Month;

public class LastYearDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate birthday = LocalDate.of(2021, Month.NOVEMBER, 24);
		
		LocalDate nextBday = birthday.withYear(LocalDate.now().getYear());
		
		if(nextBday.isBefore(LocalDate.now()) || nextBday.isEqual(LocalDate.now()))
		{
			nextBday = nextBday.plusYears(1);
		}
		
		System.out.println(nextBday);

	}

}
