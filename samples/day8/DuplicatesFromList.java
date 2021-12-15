package com.java.samples.day8;

import java.util.*;

public class DuplicatesFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> transactions = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 9, 9);
		System.out.println(transactions);
		
		Set<Integer> hashset = new LinkedHashSet(transactions);
		ArrayList<Integer> removeduplicates = new ArrayList(hashset);
		
		System.out.println(removeduplicates);
		
		

	}

}
