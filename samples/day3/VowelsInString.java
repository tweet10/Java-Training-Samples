package com.java.samples.day3;

import java.util.Scanner;

public class VowelsInString {
	public void vowelCount(String str) {
		int len = str.length();
		int count = 0;
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count ++;
			}
		}
		System.out.println(count);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		VowelsInString obj = new VowelsInString();
		obj.vowelCount(str);
	}

}
