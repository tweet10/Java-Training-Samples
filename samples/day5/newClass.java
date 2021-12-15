package com.java.samples.day5;

import java.util.Arrays;
import java.util.Scanner;

public class newClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);   
        System.out.println("Enter array size: ");
        int num=sc.nextInt();    
        int arr[]=new int[num];    
        System.out.println("Enter the elements: ");
        for(int i=0;i<num;i++)     
        {
            arr[i]=sc.nextInt();
        }
         Arrays.sort(arr);    
         System.out.printf("Sorted Array: %s",
        		 			Arrays.toString(arr));

	}

}
