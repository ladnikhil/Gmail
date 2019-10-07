 package com.dev.exceptions;

public class ExceptionHandling {

	public static void main(String[] args)  {
		
		
	

		// exception using try and catch 

		try {
			s();

		}catch(Exception e) {
			System.err.println("exception has occured"); // err in order to display message in red

			// various method to invoke exceptions
			e.printStackTrace();  // gives u exact trace of our exception
		}finally {               // it will get execute no matter what exception is and error is 
			System.err.println("this is final block"); // err in order to display message in red
		}
		System.out.println("code after exception"); // it will get executed beecasuse exception has been handled already
	}


	public static void s()   {   
		StringBuffer sb = new StringBuffer(-1);
	}

}
