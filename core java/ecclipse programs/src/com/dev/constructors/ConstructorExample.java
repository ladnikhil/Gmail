 package com.dev.constructors;

public class ConstructorExample {
	
	//user created constructor
	
	public ConstructorExample (int i) {                          // we created constructor here 
		System.out.println("this const is with int arg");
	}
	
	
	// same as default constructor
	
	public ConstructorExample () {                          // same as default constructor here we have not passed arguements
		System.out.println("this is no-arg constructor");
	}
	
	// another constructor
	
	public ConstructorExample(String s) {
		System.out.println("this const is with string arg");
	}
	
	//another constructor with string and integer arguements
	

	public ConstructorExample(String s, int i) {
		System.out.println("this const is with string and int  arg");
	}
	
	//another constructor with integer and string arguements
	

		public ConstructorExample(int i,String s) {
			System.out.println("this const is with int  and string arg");
		}
		
	
	
	public static void main(String[] args) {
		
		/// we called constructor here and we need to call it by creating an objects and it should also have arguement
		// when we create same constructor with different input arguements is known as constructor overloading and order of arguements should be same
		
		ConstructorExample ce  = new ConstructorExample(5); // constructor overloading
		ConstructorExample ce1  = new ConstructorExample(); // constructor overloading
		ConstructorExample ce2  = new ConstructorExample("a"); // constructor overloading
		ConstructorExample ce3  = new ConstructorExample("a",8); // constructor overloading
		ConstructorExample ce4  = new ConstructorExample(8,"a"); // constructor overloading
	}

}
