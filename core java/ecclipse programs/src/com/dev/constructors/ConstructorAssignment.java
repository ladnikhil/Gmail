package com.dev.constructors;

public class ConstructorAssignment {

	// constructor 

	public ConstructorAssignment() {
		//this(5);// here this keyword invokes constructor of integer arguement and it will get executed first if we want to implement and create objects on1y once
		System.out.println("their is no arguement");
	
	}

	//another constructor with int arguement

	public ConstructorAssignment(int i) {
		System.out.println("their is integer arguement");
	}

	//another constructor with string arguement

	public ConstructorAssignment(String i) {
		System.out.println("their is string  arguement");
	}

	//another constructor with string arguement

	public ConstructorAssignment(String i,int j) {
		System.out.println("their is string and integer  arguement");
	}

	//another constructor with int and string arguement

	public ConstructorAssignment(int j,String i) {
		System.out.println("their is integer and string  arguement");
	}

	
	public static void main(String[] args) {

		// calling a constructor by creating objects 
		// here we call all constructor witth same name but diff arguement types so it is known as constructor overloading

		ConstructorAssignment co = new ConstructorAssignment();
		System.out.println("output of first constructor = "+co);

		ConstructorAssignment co1 = new ConstructorAssignment(5);
		System.out.println("output of integer constructor = "+co1);

		ConstructorAssignment co2 = new ConstructorAssignment("a");
		System.out.println("output of string constructor = "+co2);

		ConstructorAssignment co3 = new ConstructorAssignment("a",8);
		System.out.println("output of string and integer constructor = "+co3);

		ConstructorAssignment co4 = new ConstructorAssignment("a",8);
		System.out.println("output of integer and string constructor = "+co4);
		
		 


	}


}
