package com.java.samples.day7;

import java.util.Scanner;

class CustomException extends Exception 
{
	public CustomException(String name) {
		super(name);
	}
}

public class IplAuction {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = sc.next();
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		
		try {
			if(age<19)
				throw new CustomException("You Are Not Eligible to Participate:(");
			else
				System.out.println("You Are Eligiible to Participate in IPL!!");
		}
		catch (CustomException e) {
			System.out.println("Exception Caught: InvalidAgeRangeException");
			System.out.println(e.getMessage());
		}
	}
	
}
