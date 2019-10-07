package com.dev.abstraction;

public class Abstraction extends AbstractExample {

	//AbstractExample ab = new AbstractExample();// we cannot create object of abstract class
	
	
// we need to override each and every abstract method of parent in child class
	@Override
	void display() {
		System.out.println("this is implemented abstract method");

	}
	
	
	@Override
	void print() {
		System.out.println("this is print method of abstract class");
		
	}

	
	public Abstraction () {      // always 
		System.out.println("costructor of abstraction class");
	}

	public static void main(String[] args) {
		
		Abstraction a =  new Abstraction();
		
		a.display();
		a.show();
		a.print(); 

	}

	
}





