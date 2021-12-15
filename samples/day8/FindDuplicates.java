package com.java.samples.day8;

import java.util.*;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> elements = new ArrayList<>();
		
		elements.add("10,000");
		elements.add("20,000");
		elements.add("20,000");
		elements.add("20,250");
		elements.add("30,000");
		elements.add("40,000");
		elements.add("30,000");
		
		System.out.println(elements);
		
		Set<String> set = new HashSet<>();
		Set<String> findduplicates = new HashSet<>();
		
		for(String duplicate : elements) {
			if(!set.add(duplicate)) {
				findduplicates.add(duplicate);
			}
		}
		
		System.out.println(findduplicates);
		
	}

}
