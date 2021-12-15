package com.java.samples.day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hset1 = new HashSet<String>();
		hset1.add("Blue");
		hset1.add("Red");
		hset1.add("Green");
		hset1.add("Yellow");
		hset1.add("Black");
		hset1.add("White");
		hset1.add("Grey");
		System.out.println(hset1);
		Iterator<String> hset1Iter= hset1.iterator();
		while(hset1Iter.hasNext()) {
			System.out.print(hset1Iter.next()+" ");
		}
		System.out.println("\n");
		for(String s:hset1) {
			System.out.print(s+" ");
		}
		System.out.println("\n");
		
		Set<String> hset2 = new HashSet<String>();
		hset2.addAll(hset1);
		hset2.remove("Grey");
		hset2.remove("Black");
		System.out.println(hset2+" "+hset1);
		//hset2.retainAll(hset1);
		//hset2.removeAll(hset2);
		//hset2.clear();
		hset2.add("Orange");
		System.out.println(hset2+" "+hset2.size()+" "+hset1+" "+hset1.size()+" ");
		
		//INTERSECTION - removes elements from hset2 that are not common in specified array hset1
		hset2.retainAll(hset1);
		//String array 
		String[] strArr= new String[hset2.size()];
		hset2.toArray(strArr);
		for(String s:strArr) {
			System.out.println(s);
		}
		Set<String> hset3 = new HashSet<String>(hset2);
		//HashSet<String> hset3 = (HashSet) hset2;
		//hset3 =  hset2;
		hset3.add("Brown");
		hset3.add("RainBow");
		hset3.add("Blue");
		System.out.println(hset3+""+hset2);
		
		//HASH SET TO TREE SET.............
		Set<String> tset1=new TreeSet<String>(hset3);
		System.out.println(tset1);
		
		//HASH SET TO ARRAY LIST..........
		List<String> arrlist=new ArrayList<String>(hset2);
		System.out.println(arrlist);
	}
		
	}


