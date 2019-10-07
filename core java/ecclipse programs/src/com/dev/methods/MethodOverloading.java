package com.dev.methods;

public class MethodOverloading {
	
	static MethodOverloading mo = new MethodOverloading();
	
	public void print() {                     // method with same name
		System.out.println("this is print method with no-arg");
	}

	public int print(int i) {					//method with same name and different arguement and we can have diff returntype and access specifier
		System.out.println("this is print method with int arg");
		return 1;
	}
	
	static String print(String str) {   // method with same name but different access specifier and returntype
		System.out.println("this is print method with string arg");
		return "a";
	}
	
	private String print(String str,String str1) {   // method with same name but different access specifier and returntype
		System.out.println("this is print method with string arg and can have private access specifier ");
		return "a";
	}
	
	final static String print(String str1,String str2,String str3) {   // method with same name but different access specifier and returntype
		System.out.println("this is print method with string arg and can have final access specifier");
		return "a";
	}
	
	
	
	
	public static void main(String[] args) {
		
		mo.print();
		mo.print(5);
		mo.print("n");
		mo.print("n","y");
		mo.print("n","y","l");
		

	}

}
