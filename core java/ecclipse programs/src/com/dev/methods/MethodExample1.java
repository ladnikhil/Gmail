package com.dev.methods;

public class MethodExample1 {

	public static void main(String[] args) {
		
		//static calling method
		int area = MethodExample.calcArea(5);  // we have called method with different class
		System.out.println("area of square = "+area);
		
		
		// non static calling method 
		
		MethodExample me = new MethodExample1();  // calling non ststic method we need to create an object of that class
		int area1 = me.areaRect(10, 5);
		System.out.println("area of rectangle is = "+area1);

	}

}
