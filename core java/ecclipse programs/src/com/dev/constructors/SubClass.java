package com.dev.constructors;

public class SubClass extends ConstructorExample{
	
	
	
	public SubClass () {
		super("A");  // HERE WE ARE INVOKING CONSTRUCTOT WITH HELP OF SUPER KEYWORD
	}
	

	public static void main(String[] args) {
		
		SubClass su = new SubClass();

	}

}
