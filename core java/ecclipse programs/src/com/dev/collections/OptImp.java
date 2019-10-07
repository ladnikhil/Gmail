package com.dev.collections;

import java.util.HashSet;

public class OptImp implements  Operating{

	HashSet <Employee> hs = new HashSet <Employee>();
	
	public static void main(String[] args) {
		OptImp op = new OptImp();
		
		

	}

	


	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addData(Employee emp) {
		
		if(emp!=null) {
			hs.add(emp);
			System.out.println(hs);
			return true;
		}
		return false;
	}




	@Override
	public void removeData(Employee emp) {
		if(emp!=null) {
			hs.remove(emp);
			System.out.println(hs);
		
		}
		 
	}




	@Override
	public void removeData() {
		// TODO Auto-generated method stub
		
	}

}
