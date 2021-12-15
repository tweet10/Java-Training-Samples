package com.java.DateTimeSample;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ArrivalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM d yyyy hh:mm a");
		
		LocalDateTime leaving = LocalDateTime.of(2013, Month.JULY, 20, 19, 30);
		ZoneId leavingZone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);
		
		try {
			String dep = departure.format(format);
			System.out.printf("Departure Time: %s (%s)%n", dep, leavingZone);
			
		} catch (DateTimeException e) {
			System.err.printf("%s Exception: Format Specifier cannot be Formatted", departure);
			throw e;
		}
		
		ZoneId arrivingZone = ZoneId.of("Asia/Tokyo");
		ZonedDateTime arrival = departure.withZoneSameInstant(arrivingZone).plusMinutes(650);
		
		try {
			String arr = arrival.format(format);
			System.out.printf("Arriving Time: %s (%s)%n", arr, arrivingZone);
		} catch(DateTimeException a) {
			System.out.printf("%s Exception: Format Specifier Cannot be Formatted", arrival);
			throw a;
		}
		
		if(arrivingZone.getRules().isDaylightSavings(arrival.toInstant()))
			System.out.printf("(%s Daylight Occuerence)", arrivingZone);
		else
			System.out.printf("(% Standard Time Occurrence)", arrivingZone);
			
		
	}

}
