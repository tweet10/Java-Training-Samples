package com.java.samples.day1;

import java.util.Scanner;

public class SumOfSquareOfEven {
	public void squareEven(){
		Scanner sc = new Scanner(System.in);
		  int num = sc.nextInt();
		  int num1=0,num2=0;
		    while(num!=0)
		    {
		    num1=num%10;
		    if((num1%2)==0)
		    num2+=num1*num1;
		    num/=10;
		    }
		   System.out.println(num2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfSquareOfEven obj = new SumOfSquareOfEven();
		obj.squareEven();

	}

}
