package com.java.samples.day5;

import java.util.Scanner;

public class ReplaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String word = sc.next();
		String rplc = word.replace('d', 'h');
		System.out.println(rplc);
	}

}
