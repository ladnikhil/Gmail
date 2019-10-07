package com.ust.ustspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ustspringboot.dto.Employee;
import com.ust.ustspringboot.repository.EmployeeRepository;

@Service("jpa")
public class EmployeeServiceJpaImpl implements EmployeeService{

	@Autowired
	EmployeeRepository repository;
	
	
	
	@Override
	public boolean addEmployeee(Employee employee) {
		repository.save(employee); // all this methods are present in jpa repository
		return true;
	}

	@Override
	public boolean removeEmployeee(int id) {
		repository.deleteById(id);
		return true;
	}

	@Override
	public boolean modifyEmployeee(Employee employee) {
		repository.update(employee.getName(), employee.getPassword() ,employee.getId());
		return true;
	}

	@Override
	public Employee getEmployee(int id) {
		
		return repository.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return repository.findAll();
	}

	
	// to get employee by name
	@Override
	public List<Employee> getEmployeesByName(String name) {
		
		return repository.findByName(name);
	}

}
