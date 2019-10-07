package com.dev.polymorphism;

public class RuntimePolymorphism {
	
	
	static RuntimePolymorphism r = new RuntimePolymorphism ();
	
	String name = "Nikhil";

	String lastname = "Lad";
	
	public void printName() {
		System.out.println(name + " " +lastname);
	}
	
	
	public static void main(String[] args) {
	
		r.printName();
	}

}
