package com.dev.abstraction;

@FunctionalInterface    // it contains only one functionalinterface
public interface Abs {
	
	
	void display();// interface has bydeafult abstract class
	
	public static void print() {   // we can declare only ststic concrete methods in interfaces
		System.out.println("n");
	}
	
	public static void print1() {
		System.out.println("k"); 
	}
	
	
	 

}
