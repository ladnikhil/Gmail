package com.ust.ustspringmvc.service;

import java.util.List;

import com.ust.ustspringmvc.dto.Employee;

public interface EmployeeService {

	public Employee auth(String email, String password);

	public boolean registerEmployee(Employee employee);

	public boolean deleteEmployee(int id);

	public boolean updateEmployee(Employee employee);

	public List<Employee> getAllEmployee();

}
