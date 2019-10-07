package com.dev.collections;

import java.util.TreeSet;

public class C5EmpTreeset  {
	
	static C5EmpTreeset c5 = new C5EmpTreeset();

	public static void main(String[] args) {

		TreeSet<Employee> em = new TreeSet<Employee>();


		Employee e = new Employee();
		e.setName("Nikhil");
		e.setId(5);
		e.setEmail("ladnikhil55@gmail.com");
		e.setPassword("1234");


		Employee e1 = new Employee();
		e1.setName("siddesh");
		e1.setId(10);
		e1.setEmail("sid@gmail.com");
		e1.setPassword("123456");
		
		em.add(e);
		em.add(e1);
		//here we will not get output first as we need to implement comparable<employee> in employee class
		System.out.println(em);// here the output will be ascending order
		
		
		
		
	}

	

}
