package com.java.samples.day5;

public class TwoDArrayUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1 = {{1,1,1},{2,2,2},{3,3,3}};
		for (int row=0;row<=array1.length-1;row++) 
		{
			for(int col=0;col<=array1[row].length-1;col++) 
			{
				System.out.println(array1[row][col]); 
			}			
		}
	}

}
