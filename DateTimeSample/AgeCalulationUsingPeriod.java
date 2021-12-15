package com.java.DateTimeSample;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class AgeCalulationUsingPeriod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		LocalDate Bday = LocalDate.of(2000, Month.APRIL, 15);
		
		Period period = Period.between(Bday, date);
		
		System.out.println(period.getDays() + "-Days " + period.getMonths() + "-Months " + period.getYears() + "-Years Old.");
		
				

	}

}
