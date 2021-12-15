package com.java.samples.day2;

import java.util.Scanner;

public class MinimumOfFourNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(a<b) {
			System.out.println(a+" is minimum");
		}else if(b<c) {
			System.out.println(b+" is minimum");
		}else if(c<d) {
			System.out.println(c+" is mimimum");
		}else if(d<a){
			System.out.println(d+" is minimum");
		}


	}

}
