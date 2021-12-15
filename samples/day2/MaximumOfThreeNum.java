package com.java.samples.day2;

import java.util.Scanner;

public class MaximumOfThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x>y) {
			System.out.println(x+" is maximum");
		}else if(x>z) {
			System.out.println(x+" is maximum");
		}else if(y>z) {
			System.out.println(y+" is maximum");
		}else {
			System.out.println(z+" is maximum");
		}
	}

}
