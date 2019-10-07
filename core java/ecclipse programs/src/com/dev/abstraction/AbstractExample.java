package com.dev.abstraction;

public abstract class AbstractExample {
	
	
	// this is abstract method

	abstract void display();  // if we declare abstratc method we should also declare it to class
	
	abstract void print();
	
	
	// this is normal method
	
	public void show() {
		System.out.println("concrete method of abstract class");
	}
	
	// we can ceate construuctorinside abstract class
	
	public AbstractExample() {
		System.out.println("constructor of abstract class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
