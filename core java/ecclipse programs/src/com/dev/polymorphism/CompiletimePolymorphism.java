package com.dev.polymorphism;

public class CompiletimePolymorphism {
	
	static CompiletimePolymorphism co = new CompiletimePolymorphism();
	
	
	// compiletime polymorphism
	// here we have added three functions with same method but different arguements 
	public int add (int a,int b) {
		int add = a + b;
		System.out.println("addition of two numbers  = "+add);
		return add;
		}
	
	
	public int add (int a,int b, int c) {
		int add = a + b + c;
		System.out.println("addition of three numbers  = "+add);
		return add;
		}
	
	public int add (int a,int b,int c,int d) {
		int add = a + b + c + d;
		System.out.println("addition of four numbers  = "+add);
		return add;
		}
	
	

	public static void main(String[] args) {
		
		co.add(5,10);
		co.add(80, 90,80);
		co.add(70, 80,60,20);
		
	}

}
