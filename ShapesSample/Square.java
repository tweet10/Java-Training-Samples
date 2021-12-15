package com.java.ShapesSample;



public class Square extends Shape {
	
	private int side;
	Square(String name, int side)
	{
		super(name);
		this.side = side;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	
	
	@Override
	public float calculateArea() {
		
		return side*side;
	}
	
	

}
