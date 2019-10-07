package com.dev.inheritance;

public class ChildClass extends ParentClass{

	
	@Override                         // here we have wriiten ovveride because we need to override this method which is present in parentclass 
	public int add(int a,int b) {
		int add = a - b;
		System.out.println(add);
		return add;
	}

	
	@Override
	private int add(int a,int b) {        // shows error as private class cannot be overrided 
		int add = a - b;
		System.out.println(add);
		return add;
	}
	
	@Override
	int add(int a,int b) {                // shows error as default class cannot be overrided
		int add = a - b;
		System.out.println(add);
		return add;
	}
	
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		 c.add(5, 3);  // here method is overriding as it s not taking parentclass function
		
	}
	
	
	
	
	

}
