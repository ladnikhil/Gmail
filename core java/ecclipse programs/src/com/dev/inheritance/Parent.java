package com.dev.inheritance;

public class Parent {

	static Parent p = new Parent();

	String lastname = "LAD";
	String name = "rahul";

	public static void main(String[] args) {

		p.printName();
	}


	public void printName() {

		System.out.println(name + " "+lastname);

	}

}
