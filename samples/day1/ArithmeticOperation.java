package com.java.samples.day1;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Addition: "+(num1+num2));
		System.out.println("Subtraction: "+(num1-num2));
		System.out.println("Multiplication: "+(num1*num2));
		System.out.println("Division: "+(float)(num1/num2));
		System.out.println("Modulo: "+(num1%num2));
		
	}

}
