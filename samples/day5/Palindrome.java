package com.java.samples.day5;

import java.util.Scanner;
import static java.lang.System.out;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String rev = new StringBuilder(str).reverse().toString();
		if(str.equals(rev)) {
			out.println("Palindrome");
		}else {
			out.println("Not Palindrome");
		}
	}

}
