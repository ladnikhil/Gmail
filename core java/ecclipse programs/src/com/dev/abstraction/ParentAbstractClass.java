package com.dev.abstraction;

public abstract class ParentAbstractClass {
	
	abstract void name();
	
	abstract void print();
	
	public void show() {
		System.out.println("this concrete method of parentabstractclass");
	}
	
	public ParentAbstractClass() {
		System.out.println("i am from parentabstractclass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
