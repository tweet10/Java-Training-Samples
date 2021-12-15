package com.java.samples.day3;

import java.util.Scanner;

public class LoopingSamples {
	public void forLoop() {
		System.out.println("For Loop");
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
	public void whileLoop() {
		System.out.println("While Loop");
		int i=1;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
	}
	public void doWhile() {
		System.out.println("Do-while Loop");
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=100);
	}
	public void sumofEven() {
		System.out.println("Sum of Even");
		int i,sum=0;
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	public void sumofOdd() {
		System.out.println("Sum of Odd");
		int i=1,sum=0;
		while(i<=100) {
			sum=sum+i;
			i=i+2;
		}
		System.out.println(sum);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopingSamples obj = new LoopingSamples();
		obj.forLoop();
		obj.whileLoop();
		obj.doWhile();
		obj.sumofEven();
		obj.sumofOdd();
	}
}
