package com.dev.encapsulation;

public class StudentData {
	

	public static void main(String[] args) {
		
			Student s = new Student(); // other class object
			
			s.setRegno(2058970);
			s.setName("Nikhil");
			s.setEmail("ladnikhil55@gmail.com");
			s.setPassword("1234");
			
			 
			System.out.println("reg no is = "+s.getRegno());
			
			System.out.println("name is = "+s.getName());
			
			System.out.println("emailid is = "+s.getEmail());
			
			System.out.println("************* ");
			

	}

}
