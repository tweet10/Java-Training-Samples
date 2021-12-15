package com.java.samples.day7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		try {
			try {
				System.out.println("Enter Two Values: ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				System.out.println(num1/num2);
				}catch(InputMismatchException e) {
					System.out.println("InputMismatchException");
				}
			}catch(ArithmeticException a) {
				System.out.println("ArithmeticException: / By Zero");
			}
			
			
			
			}
	}


