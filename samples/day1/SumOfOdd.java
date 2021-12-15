package com.java.samples.day1;

import java.util.Scanner;

public class SumOfOdd {
	public void chechSum() {
		Scanner sc = new Scanner(System.in);
		int i,num,sum=0;
		num = sc.nextInt();
		for(i=1;i<=num;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		if(sum%2==0) {
			System.out.println("-1");
		}else if(sum%2!=0) {
			System.out.println("1");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfOdd obj = new SumOfOdd();
		obj.chechSum();
		

	}

}
