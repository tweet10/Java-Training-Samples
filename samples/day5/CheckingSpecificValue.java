package com.java.samples.day5;

import java.util.Scanner;

public class CheckingSpecificValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[]{1, 2, 3, 4, 5};
		boolean yes = false;
		System.out.println("Enter searching value: ");
		int val = sc.nextInt();
		for(int x : arr){
			if(x == val){
		        yes = true;
		        break;
		    }
		}
		System.out.println(yes);
	}
	

}
