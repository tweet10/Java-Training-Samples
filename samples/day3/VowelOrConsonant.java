package com.java.samples.day3;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char en = sc.next().charAt(0);
		switch(en)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(en+" is Vowel");break;
		default:
			System.out.println(en+" is Consonent");break;
		}

	}

}
