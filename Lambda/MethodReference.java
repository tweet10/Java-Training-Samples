package com.java.Lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class MethodReference {

	@FunctionalInterface
	interface MyInterface {
		void display();
	}

	static class Example {
		public void myMethod() {
			System.out.println("Instance method");
		}
	}

	@FunctionalInterface
	interface BiFunction<T, U, V> {
		void apply();
	}

	static class Multiplication {
		public static int multiply(int a, int b) {
			return a + b;
		}
	}

	@FunctionalInterface
	interface HelloInterface {
		Hello display(String say);
	}

	static class Hello {
		public Hello(String say) {
			System.out.println(say);
		}
	}

	private static Collection<Bicycle> createBicyclesList() {
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example obj = new Example();
		MyInterface ref = obj::myMethod;
		ref.display();

		BicycleComparator bikeFrameSizeComparator = new BicycleComparator();
		
		createBicyclesList().stream().sorted(bikeFrameSizeComparator::compare);

		
		String[] stringArray = { "Steve", "Rick", "Adithya", "Negam", "Lucy", "Sansa", "Jon" };

		

		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for (String str : stringArray) {
			System.out.println(str);
		}

		List<Integer> numbers = Arrays.asList(5, 30, 50, 24, 40, 2, 9, 18);
		numbers.sort((a, b) -> a.compareTo(b));
		numbers.sort(Integer::compareTo);

		

		HelloInterface ref1 = Hello::new;
		ref1.display("hello");

	}
}

class Bicycle {
	private String brand;
	private Integer frameSize;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getFrameSize() {
		return frameSize;
	}

	public void setFrameSize(Integer frameSize) {
		this.frameSize = frameSize;
	}

}

class BicycleComparator implements Comparator<Bicycle> {

	@Override
	public int compare(Bicycle o1, Bicycle o2) {
		// TODO Auto-generated method stub
		return o1.getFrameSize().compareTo(o2.getFrameSize());
	}
}
