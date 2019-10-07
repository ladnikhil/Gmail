package com.dev.polymorphism;

public class RuntimePolymorpihism2 extends RuntimePolymorphism{
	
	static RuntimePolymorpihism2 ru = new RuntimePolymorpihism2();
	

	String name = "ANIKET";

	String lastname = "Lad";
	
	
	//runtime polymorphism
	
	// here we method overriding is done as same method is present in runtimepolymorphism class
	
	@Override 
	
	public void printName() {
		
		System.out.println(name + " " +lastname);
	}
	

	public static void main(String[] args) {
		
		ru.printName();
	}

}
