package com.java.samples.day6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCalculator calculator = new MyCalculator();
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(calculator.divisor_sum(num));

	}

}
