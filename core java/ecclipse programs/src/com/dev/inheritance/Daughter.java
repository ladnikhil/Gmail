package com.dev.inheritance;

public class Daughter extends Father{
	
	static Daughter d = new Daughter();
	
	//@override
	
	public void printName() {
		String name = "sansa";
		System.out.println(name + " " +super.name+" " +d.lastName);
		super.printName();          // here we called function from parent class father with help of keyword
	}

	public static void main(String[] args) {
		
		d.printName();
	}

}
