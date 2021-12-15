package com.java.samples.day8;


import java.util.*;

public class SortAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> TransactionAmount = new ArrayList<>();
		
		TransactionAmount.add("10,020");
		TransactionAmount.add("10,202");
		TransactionAmount.add("30,001");
		TransactionAmount.add("29,999");
		TransactionAmount.add("10,122");
		
		System.out.println(TransactionAmount);
		
		Collections.sort(TransactionAmount);
		
		System.out.println(TransactionAmount);
		
		
	}

}
