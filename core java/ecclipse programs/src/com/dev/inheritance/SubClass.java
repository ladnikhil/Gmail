package com.dev.inheritance;

public class SubClass extends SuperClass  {
	
	 
	
	public SubClass () {
		super("ASD",10);
		

	}
	
	public SubClass (int i) {
		super(10);                           // invoking other constructor from diffrenet class
		

	}
	
	public SubClass (int i,String s) {
		super(10,"k");                           // invoking other constructor from diffrenet class
		

	}
	
	public SubClass (String s,int i) {
		super("k",10);                           // invoking other constructor from diffrenet class
		

	}
	
	public SubClass (String s) {
		super("k");                           // invoking other constructor from diffrenet class
		

	}
	
	
	
	
	
	

	
	
	

	public static void main(String[] args) {
		
		SubClass s = new SubClass();
		SubClass s1 = new SubClass(5);
		SubClass s2 = new SubClass(10,"k");
		SubClass s3 = new SubClass("k",10);
		SubClass s4 = new SubClass("k");
		
		
	}

}
