package com.dev.inheritance;

public class GrandFather {
	
	static GrandFather g = new GrandFather();
	
	String lastName = "lad";
	String name = "torren";  // global variable
	
	public static void main(String[] args) {
		
		g.printName();

	}

	
	public void printName() {
		
		System.out.println(name + " "+lastName);
		
	}
}
