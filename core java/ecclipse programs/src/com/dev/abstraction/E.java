package com.dev.abstraction;

public class E implements Abs,Abs2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abs.print();
		E e = new E();
		e.display();
		
		
	

	}

	@Override
	public void display() {
		System.out.println("display method of interface abs");
		
	}

	@Override
	public void display1() {
		System.out.println("displays method of interface abs2");
		
	}

}
