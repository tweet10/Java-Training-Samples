package com.java.samples.day5;

import java.util.Scanner;

public class StringToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String word = sc.next();
		String lowCase = word.toLowerCase();
		System.out.println(lowCase);
	}

}
