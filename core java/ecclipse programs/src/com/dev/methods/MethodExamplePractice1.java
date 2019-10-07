package com.dev.methods;

public class MethodExamplePractice1 {
	
	static int i; // i is global varibale can be used any where
	
	static int j;
	
	static MethodExamplePractice1 me = new MethodExamplePractice1(); // to call nonstatic method we need to create objects
	
	// static method
	
	public static int calArea(int side) {
		 i = side * side;
		System.out.println("area of square = "+i);
		return i;
	}
	
	// non static method
	
	public int calRect(int length,int breadth) {
		int area = length * breadth;
		System.out.println("area of rectangle = "+area);
		return area;
	}

	public static void main(String[] args) {
		
		//calling static method
		
		 i = calArea(5);
		
		
		// calling non ststic method 
		//MethodExamplePractice1 me = new MethodExamplePractice1();
		 j = me.calRect(4, 10);
		
	}

}
