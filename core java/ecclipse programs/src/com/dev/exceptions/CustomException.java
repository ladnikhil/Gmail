package com.dev.exceptions;

public class CustomException extends Exception{
	
	public CustomException() {
		//System.out.println("value is less then 10 ");
	}
	
	public CustomException(int i) {
		System.out.println("custom exception with integer");
	}
	
	public CustomException(String name) {
		super(name);
		//System.out.println("custom exception with string ");
	}
	
	

	public static void main(String[] args) {
		

	}

}
