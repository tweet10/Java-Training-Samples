package com.java.DateTimeSample;

import java.time.OffsetDateTime;

public class OffSetDateTimeSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OffsetDateTime datetime = OffsetDateTime.now();
		
		
		System.out.println("Hour: "+datetime.getHour());
		System.out.println("Minute: "+datetime.getMinute());
		System.out.println("Second: "+datetime.getSecond());
		
	}

}
	