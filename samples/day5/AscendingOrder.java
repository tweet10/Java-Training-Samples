package com.java.samples.day5;

import java.util.Scanner;
import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		System.out.println("Enter elements: ");
		for(int str=0;str<num;str++) {
			arr[str] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Sorted Elements: "+Arrays.toString(arr));
	}

}
