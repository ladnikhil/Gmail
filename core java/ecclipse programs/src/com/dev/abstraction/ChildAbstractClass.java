package com.dev.abstraction;

public abstract class ChildAbstractClass extends ParentAbstractClass {
	
	
	
	abstract void age();
	
	abstract void desigination();
	
	public ChildAbstractClass () {
		System.out.println("i am constructor of childabstractclass");
	}
	
	@Override
	void name() {
		System.out.println("i am nikhil's child");
		
	}


	public static void main(String[] args) {
		
		 
	}

}
