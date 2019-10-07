package com.dev.exceptions;

public class ThrowsKeyword {

	// whn we use thrws keyword we need to write throw exception in front of main method
	public static void main(String[] args) throws Exception,NegativeArraySizeException{ //it might throw an exception
		// we can throw more multiple exceptons at same time
		
		
		s();
		System.out.println("code after execution");
		

	}
	

	public static void s() throws Exception,NegativeArraySizeException  {   // whn we use thrws keyword we need to write throw exception i front of method
		StringBuffer sb = new StringBuffer(-1);
	}

}
