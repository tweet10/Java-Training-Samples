package com.java.samples.day8;

import java.util.*;

public class priorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> elements = new PriorityQueue<>();
		
		elements.add("abccc");
		elements.add("1234");
		elements.add("12cv");
		elements.add("30000");
		
		while(!elements.isEmpty()) {
			System.out.println(elements.poll());
		}

	}

}
