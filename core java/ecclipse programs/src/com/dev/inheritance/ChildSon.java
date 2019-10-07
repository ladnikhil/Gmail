package com.dev.inheritance;

public class ChildSon extends Child {
	
	static ChildSon cs = new ChildSon();

	public static void main(String[] args) {
		
		cs.printName();
		

	}
	
	public void printName() {
//		String name = "sansa";
//		System.out.println(name + " " +super.name+" " +d.lastName);
		super.printName();          // here we called function from parent class father with help of keyword
	}

}
