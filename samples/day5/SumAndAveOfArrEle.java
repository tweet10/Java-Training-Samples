package com.java.samples.day5;

import java.util.Scanner;

public class SumAndAveOfArrEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		float average;
		System.out.println("Enter size of array: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int num=0;num<n;num++) {
			System.out.println("Enter element: "+num);
			arr[num] = sc.nextInt();
			sum = sum+arr[num];
		}
		System.out.println("Sum = " +sum);
		average = (float)sum/n;
		System.out.println("Average = " +average);	
	}

}
