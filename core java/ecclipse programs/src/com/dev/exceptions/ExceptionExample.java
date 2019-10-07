package com.dev.exceptions;

public class ExceptionExample {

	public static void main(String[] args) {
	
		double d = 10.0;
		
		double q = 0.0;
		
		System.out.println("result =  "+d/q);
		
		System.out.println("print statement before");
		s();
		System.out.println("print statement after");  //exception occurs after the method is called
		
		

	}
	
	
	public static void s() {
		StringBuffer sb = new StringBuffer(-1);
	}

}
