package com.dev.inheritance;

public class Son extends Father {
	
	static  Son s = new Son();
	
	
	@Override
	public void printName() {
		String name = "omkar";
		System.out.println(name + " " +super.name+" " +s.lastName);
		super.printName(); // getting output from father 
	}

	public static void main(String[] args) {
		
		s.printName();
	}

}
