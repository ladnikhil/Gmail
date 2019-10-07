package com.ust.ustglobalspringcore.beans;

import org.springframework.stereotype.Component;

@Component("human")
public class Human implements Animal {

	@Override
	public void makeSound() {
		
		System.out.println("blaa bla bla .........");
		
	}

}
