package com.java.samples.day7;

import java.util.Scanner;

public class RunRate {
	
	Scanner sc = new Scanner(System.in);
	int runs, overs;
	float runrate;
	
	public void GetData() {
	
		try {
		System.out.println("Enter the Runs: ");
		runs = sc.nextInt();
		System.out.println("Enter the Overs Faced: ");
		overs = sc.nextInt();
		}
	
		catch(NumberFormatException e) {
		System.out.println("Exception Caught: NumberFormatException "+e);
		System.out.println(e.getMessage());
		}
	}
	
	public void ShowData() {
		
		runrate = runs/overs;
		System.out.println("Current Run Rate: "+ runrate);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunRate runrate = new RunRate();
		runrate.GetData();
		runrate.ShowData();
	}

}
