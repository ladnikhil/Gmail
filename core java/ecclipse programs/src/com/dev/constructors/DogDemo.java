package com.dev.constructors;

public final class DogDemo extends Dog { // here final class can extend normal class
	
	// but class is final we cannot inherit that class
	
	@Override
	 static void print() {          // it shows error as final method cannot be overriden
		System.out.println("dog method");
	}

	public static void main(String[] args) {
		
		Dog.print(); // we can call final method  which is present n other class

	}

}
