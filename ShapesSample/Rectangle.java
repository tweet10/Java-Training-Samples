package com.java.ShapesSample;


public class Rectangle extends Shape
{
	private int length;
	private int breadth;
	
	Rectangle(String name, int length, int breadth) 
	{
		super(name);
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public float calculateArea() {

		return length*breadth;
	}
	
	
	
}
