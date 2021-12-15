package com.java.samples.day2;

import java.util.Scanner;

public class NegativeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		if(x<0) {
			System.out.println( x +" is a negative number");
		}else {
			System.out.println( x +" is not a negative number");
		}

	}

}
