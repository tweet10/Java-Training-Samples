package com.java.samples.day3;

import java.util.Scanner;

public class SumOfNEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,num,sum=0;
		num = sc.nextInt();
		for(i=1;i<=num;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of Even Numbers upto "+num+" is "+sum);

	}

}
