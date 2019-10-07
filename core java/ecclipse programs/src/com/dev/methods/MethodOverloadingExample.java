package com.dev.methods;

public class MethodOverloadingExample {
	
	static MethodOverloadingExample me = new MethodOverloadingExample();
	
	
	// for addition
	
	public int add(int a,int b) {
		int add = a + b;
		System.out.println("adddition of two numbers = "+add);
		return add;
	}
	
	public int add(int i,int j,int k) {
		int add = i + j + k;
		System.out.println("adddition of three numbers = "+add);
		return add;
	}
	
	public int add(int a,int b,int c,int d) {
		int add = a + b + d;
		System.out.println("adddition of four numbers = "+add);
		return add;
	}
	
	//for substraction
	
	public int sub(int a,int b) {
		int sub = a - b;
		System.out.println("substraction of two numbers = "+sub);
		return sub;
	}
	
	

	public int sub(int a,int b,int c) {
		int sub = a - b - c;
		System.out.println("substraction of three numbers = "+sub);
		return sub;
	}
	

	public int sub(int a,int b,int c,int d) {
		int sub = a - b - c - d;
		System.out.println("substraction of four numbers = "+sub);
		return sub;
	}
	
	
	// for multiplication
	
	
	public float mul(float a,float b) {
		float mul = a * b;
		System.out.println("multplication of two numbers = "+mul);
		return mul;
	}
	

	public float mul(float a,float b,float c) {
		float mul = a * b * c;
		System.out.println("multplication of three numbers = "+mul);
		return mul;
	}
	
	
	
	
	public float mul(float a,float b,float c,float d) {
		float mul = a * b * c * d;
		System.out.println("multplication of four numbers = "+mul);
		return mul;
	}
	
	
	// division
	
	
	double div(int a,int b) {
		double div = a / b;
		System.out.println("divison of two numbers = "+div);
		return div;
	}

	

	double div(int a,int b,int c) {
		double div = a / b / c;
		System.out.println("divison of three numbers = "+div);
		return div;
	}
	

	double div(int a,int b,int c, int d) {
		double div = a / b / c /d;
		System.out.println("divison of four numbers = "+div);
		return div;
	}


	public static void main(String[] args) {
		
		me.add(5,10);
		me.add(5,5,10);
		me.add(5,10,10,10);
		
		me.sub(80, 50);
		me.sub(80, 50, 10);
		me.sub(30, 10, 5, 5);
		
		me.mul(10, 50);
		me.mul(10, 5, 2);
		me.mul(10, 5 , 2, 2);
		
		me.div(60, 10);
		me.div(100, 10, 2);
		me.div(1000,20,10,1);
		
	

	}

}
