package com.ust.ustspringrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ustspringrest.dao.EmployeeDao;
import com.ust.ustspringrest.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService  {

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public boolean addEmployeee(Employee employee) {
		
		if(employee.getName()==null || employee.getEmail()==null || employee.getPassword()==null)
		return false;
		return dao.addEmployeee(employee);
	}

	@Override
	public boolean removeEmployeee(int id) {
		
		return dao.removeEmployeee(id);
	}

	@Override
	public boolean modifyEmployeee(Employee employee) {
		
		if(employee.getName()==null || employee.getEmail()==null || employee.getPassword()==null)
		return false;
		return dao.modifyEmployeee(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		
		return dao.getEmployee(id);
	}
	
	
	

	@Override
	public List<Employee> getAllEmployees() {
		
		return dao.getAllEmployees();
	}
	
	

}
