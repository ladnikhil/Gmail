package com.dev.constructors;

public class Dog {
	 
	// when we declare any final variable we give that variable in bloc letters
	
	
	final static int I = 10;
	
	final static void print() {
		System.out.println("dog method");
	}
	
	public static void main(String[] args) {
		
		System.out.println(I);
		
		// I =12; // we cannot redeclare final variable
	}

}
