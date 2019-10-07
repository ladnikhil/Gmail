package com.dev.exceptions;

public class ExceptionHandling3 {
	
	

	public static void main(String[] args) throws Exception{
		
		try {
			s();
			System.out.println("no exception for s()");
			int res = divide(10,8);
			System.out.println("no  exception for divide()");
			System.out.println(res);
			
		} catch (NegativeArraySizeException e) {
			System.err.println("exception caught innegativearraysizeexception block "); // err todisplay it in red color
			System.err.println("getMeassage()"+e.getMessage()); // to get the message of what our error is and here return type is string
			//e.printStackTrace();
			//System.out.println(e.getLocalizedMessage()); // to get message of our own
			//System.exit(0);  to hault execution of program then and their itself 
		}catch(ArithmeticException e) {
			System.err.println("exception caught in ArithmeticException block"); // err todisplay it in red color
			System.err.println("getMeassage()"+e.getMessage()); // to get the message of what our error is
		}
		// here we have to always right catch(Exception e) atlast because it belongs to parent exception and we have to always do this if we have multiple catch blocks
		catch(Exception e) {
			System.out.println("their is exception in normal exception block");
		}
		 
		// for throw exception of our own 
		int x = 2;
		if(x<10)  {
			// here customexception is aclass created for exceptions their we have message
			throw new CustomException("value of x is less then 10");
			
			
		}
		
		
	}
	
	public static void s()   {   
		StringBuffer sb = new StringBuffer(1);
	}
	
	public static int divide(int i,int j) {
		int res = i/j;
		System.out.println(res);
		return 1;
	}
	
	

}
