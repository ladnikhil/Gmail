package com.dev.collections;

public class OptData {

	public static void main(String[] args) {
		
		OptImp op = new OptImp();
		
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
		
		// to add data
		op.addData(e);
		op.addData(e1);
		
		// to removedata
		op.removeData(e1);
		
				

	}

}
