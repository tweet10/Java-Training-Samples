package com.java.samples.day3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fac=1,num;
		num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			fac=fac*i;
		}
		System.out.println(fac+" is Factorial of "+num);
	}

}
