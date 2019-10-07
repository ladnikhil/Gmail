package com.ust.ustspringmvc.dao;

import java.util.List;

import com.ust.ustspringmvc.dto.Employee;



public interface EmployeeDao {
	
	public Employee auth(String email,String password);
	
	public boolean registerEmployee(Employee employee);
	
	public boolean deleteEmployee(int id);
	
	public boolean updateEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	

}
