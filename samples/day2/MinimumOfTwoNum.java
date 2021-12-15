package com.java.samples.day2;

import java.util.Scanner;

public class MinimumOfTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x<y) {
			System.out.println(x+" is minimum");
		}else {
			System.out.println(y+" is minimum");
		}

	}

}
