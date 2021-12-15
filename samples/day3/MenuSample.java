package com.java.samples.day3;

import java.util.Scanner;

public class MenuSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Choose the option to be performed: ");
		System.out.println("(1) Addition \n(2) Subtraction \n(3) Multiplication \n(4) Division");
		int opt = sc.nextInt();
		switch(opt)
		{
		case 1: System.out.println("Result = "+(num1+num2));break;
		case 2: System.out.println("Result = "+(num1-num2));break;
		case 3: System.out.println("Result = "+(num1*num2));break;
		case 4: System.out.println("Result = "+(float)(num1/num2));break;
		default: System.out.println("Invalid Option");break;
		}
		

	}

}
