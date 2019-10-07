package com.dev.inheritance;

public class ParentClass {

	
	static ParentClass p = new ParentClass();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  p.add(5,10);
		
	}
	
	
	
	public  int add(int a,int b) {
		int add = a + b;
		System.out.println(add);
		return add;
	}
	

	private  int add(int a,int b) {
		int add = a + b;
		System.out.println(add);
		return add;
	}
	

	 int add(int a,int b) {
		int add = a + b;
		System.out.println(add);
		return add;
	}


	
	

}
