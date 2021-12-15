package com.java.samples.day1;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%3==0 && num%5==0) {
			System.out.println(num+" Fizz Buzz");
		}else if (num%3==0) {
			System.out.println(num+" Fizz");
		}else if (num%5==0) {
			System.out.println(num+" Buzz");
		}else {
			System.out.println(num+" INVALID");
		}
	}

}
