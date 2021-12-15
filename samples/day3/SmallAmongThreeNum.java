package com.java.samples.day3;

import java.util.Scanner;

public class SmallAmongThreeNum {
	public void smallestNumber(int num1,int num2,int num3) {
		if(num1<num2) {
			System.out.println(num1+" is small");
		}else if(num1<num3) {
			System.out.println(num1+" is small");
		}else if(num2<num3) {
			System.out.println(num2+" is small");
		}else {
			System.out.println(num3+" is small");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		SmallAmongThreeNum obj = new SmallAmongThreeNum();
		obj.smallestNumber(num1, num2, num3);
		
		
	}

}
