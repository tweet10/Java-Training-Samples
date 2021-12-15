package com.java.samples.day5;

import java.util.Scanner;

public class FindingIndexOfValue {
	public static int valPosition(int arr[], int ind)
    {
        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == ind) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int num=0;num<=10;num++) {
			arr[num]=sc.nextInt();
		}
		System.out.println("5th element is: "+ valPosition(arr,5));

	}

}
