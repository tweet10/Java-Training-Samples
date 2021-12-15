package com.java.ShapesSample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("1. Circle");
		System.out.println("2. Square");
		System.out.println("3. Rectangle");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Shape");
		int num = sc.nextInt();
		
		switch(num) 
		{
		case 1: 
			System.out.println("Enter the Radius");
			int radius = sc.nextInt();
			Circle circle = new Circle("Area of Circle", radius);
			System.out.println("Area of Circle is "+circle.calculateArea()); break;
		
		
		case 2: 
			System.out.println("Enter the Side");
			int side = sc.nextInt();
			Square square = new Square("Area of Square", side);
			System.out.println("Area of Square is "+square.calculateArea()); break;
		
		
		case 3: 
			System.out.println("Enter the Length");
			int length = sc.nextInt();
			System.out.println("Enter the Breadth");
			int breadth = sc.nextInt();
			Rectangle rectangle = new Rectangle("Area of Rectangle", length, breadth);
			System.out.println("Area of Rectangle is "+rectangle.calculateArea()); break;
		default: break;
		}
		
		
	}

}
