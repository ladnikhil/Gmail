package com.dev.inheritance;

public class SuperClass {


	
	public SuperClass (int i) {                          
		System.out.println("this const is with int arg");
	}
	
	

	
	public SuperClass () {                         
		System.out.println("this is no-arg constructor");
	}
	
	
	
	public SuperClass(String s) {
		System.out.println("this const is with string arg");
	}
	

	

	public SuperClass(String s, int i) {
		System.out.println("this const is with string and int  arg");
	}
	
	
	

		public SuperClass(int i,String s) {
			System.out.println("this const is with int  and string arg");
		}
		
	
	
	
	public static void main(String[] args) {
	
		SuperClass sup = new SuperClass();
		SuperClass sup1 = new SuperClass(5);
		SuperClass sup2 = new SuperClass("k");
		SuperClass sup3 = new SuperClass("k",10);
		SuperClass sup4 = new SuperClass(10,"10");

	}

}
