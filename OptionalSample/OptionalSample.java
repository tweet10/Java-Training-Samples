package com.java.OptionalSample;

import java.util.Optional;

public class OptionalSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<String> empty = Optional.empty();
		
		String name = "Bealdung";
		Optional<String> optional = Optional.of(name);
		
		if(optional.isPresent()) {
			System.out.println(optional);
			System.out.println(optional.get());
		}
		
		name = null;
		Optional.of(name);
		name = "Bealdunng";
		optional = Optional.ofNullable(name);
		
		if(optional.isPresent()) {
			System.out.println(optional);
			System.out.println(optional.get());
		}
		
		name = null;
		optional = Optional.ofNullable(name);
		
		if(optional.isPresent()) {
			System.out.println(optional);
			System.out.println(optional.get());
		}
		
		if(name != null) {
			System.out.println(name.length());
		}
		
		optional = Optional.of("Bealdung");
		optional.ifPresent(n -> System.out.println(n.length()));
		
		String nullName = null;
		name = Optional.ofNullable(nullName).orElse("Sam");
		System.out.println(name);
		
		nullName = null;
		name = Optional.ofNullable(nullName).orElseGet(() -> "Sam");
		System.out.println(name);
		
		OptionalSample optionalsample = new OptionalSample();
		String text = "text";
		
		String defaultText = Optional.ofNullable(text).orElseGet(optionalsample::getMyDefault);
		System.out.println(defaultText);
		
		nullName = null;
		name = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
		
		optional = Optional.of("Bealdung");
		name = optional.get();
		
		optional = Optional.ofNullable(null);
		name = optional.get();
		
	}
	
	public String getMyDefault() {
		System.out.println("Getting Default Value");
		return "Default Value";
	}

}
