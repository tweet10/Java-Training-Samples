package com.java.samples.day3;
class A{
	public void setData1() {
		System.out.println("Test Data of Class A");
	}
}
class B extends A	{
	public void setData2() {
		System.out.println("Test Data of Class B");
	}
}
public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.setData1();
		obj.setData2();
	}
}
