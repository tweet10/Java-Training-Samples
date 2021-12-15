package com.java.samples.day5;

import java.util.Scanner;

public class FromToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int from = sc.nextInt();
		int to = sc.nextInt();
		System.out.println(str.substring(from,to));
	}

}
