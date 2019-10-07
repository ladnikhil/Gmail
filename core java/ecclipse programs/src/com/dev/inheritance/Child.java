package com.dev.inheritance;

public class Child extends Parent{
	
	static Child c = new Child();
	
	String name = "Nikhil";

	public static void main(String[] args) {
	
		c.printName();
	}

	
	public void printName() {
		String name = "Nikhil";
		System.out.println(name + " "+super.name+" "+c.lastname); // here super acqurires property of class grandfather so totten
	}
}
