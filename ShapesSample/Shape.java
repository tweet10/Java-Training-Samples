package com.java.ShapesSample;

public abstract class Shape {
	
	String name;
	
	Shape(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public abstract float calculateArea();

}
