package com.java.samples.day1;

import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int swap = num1;
		num1 = num2;
		num2 = swap;
		System.out.println("Swapped Value: "+num1+" "+num2);
		

	}

}
