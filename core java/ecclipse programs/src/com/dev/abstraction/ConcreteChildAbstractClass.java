package com.dev.abstraction;

public class ConcreteChildAbstractClass extends ChildAbstractClass {

	
	public static void main(String[] args) {
		
		ConcreteChildAbstractClass c = new ConcreteChildAbstractClass();
		
		c.age();
		c.name();
		c.desigination();
		c.print();
	}

	@Override
	void age() {
		System.out.println("my age is 21");
		
	}

	@Override
	void desigination() {
		System.out.println("my designation is sofware developer");
		
	}

	@Override
	void print() {
		System.out.println("this is concrete child class");
		
	}

}
