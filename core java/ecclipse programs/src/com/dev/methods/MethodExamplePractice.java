package com.dev.methods;

public class MethodExamplePractice {

	public static void main(String[] args) {
		
		// calling ststic method from another class
		
		MethodExamplePractice1.calArea(10);
		
		
		// calling non ststic method from a another class
		
		MethodExamplePractice1 me = new MethodExamplePractice1();// we need to create  object 
		me.calRect(5,10);

	}

}
