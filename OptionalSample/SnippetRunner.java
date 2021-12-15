package com.java.OptionalSample;

import java.util.Optional;

public class SnippetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<String> empty = Optional.empty();
		
		String name = "Bealdung";
		Optional<String> optional = Optional.of(name);
		
		name = null;
		optional = Optional.ofNullable(name);
		
		if(optional.isPresent()) {
			System.out.println(optional);
			System.out.println(optional.get());
		}
	}

}
