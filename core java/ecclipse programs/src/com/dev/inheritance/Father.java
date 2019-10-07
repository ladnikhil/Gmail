package com.dev.inheritance;

public class Father extends GrandFather { // acqurires property form otherclass

	static Father f = new Father();
	
	String name = "Nikhil";
	
	
	@Override
	
	public void printName() {
		String name = "Nikhil";
		System.out.println(name + " "+super.name+" "+f.lastName); // here super acqurires property of class grandfather so totten
	}
	
	public static void main(String[] args) {
		
		f.printName();

	}

}
