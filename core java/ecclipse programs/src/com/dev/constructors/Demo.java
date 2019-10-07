package com.dev.constructors;

import com.dev.methods.MethodExample; // import because we have that class in another package

public class Demo {

	public static void main(String[] args) {
		
		
		int i =  MethodExample.calcArea(5);
		System.out.println(i);
		
	}

}
