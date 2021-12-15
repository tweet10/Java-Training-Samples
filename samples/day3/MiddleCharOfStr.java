package com.java.samples.day3;

import java.util.Scanner;

public class MiddleCharOfStr {
	public void mid(String str) {
		int mid;
		int len = str.length();
		if(len%2==0) {
			mid = len/2-1;
			len = 2;
		}else {
			mid = len/2;
			len = 1;
		}
		String res = str.substring(mid,mid+len);
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		MiddleCharOfStr obj = new MiddleCharOfStr();
		obj.mid(str);

	}

}
