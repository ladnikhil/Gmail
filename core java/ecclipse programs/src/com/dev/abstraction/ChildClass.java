package com.dev.abstraction;

public class ChildClass extends ParentAbstractClass{
	
	

	public static void main(String[] args) {
		
		ChildClass c = new ChildClass();
		
		c.show();
		c.name();
		c.print();
		
	}

	@Override
	void name() {
		System.out.println("my name is nikhil");
		
	}

	@Override
	void print() {
		System.out.println("i am in child class");
		
	}
	

}
