package com.ust.ustspringboot.service;

import java.util.List;

import com.ust.ustspringboot.dto.Employee;

public interface EmployeeService {

	public boolean addEmployeee(Employee employee);

	public boolean removeEmployeee(int id);

	public boolean modifyEmployeee(Employee employee);

	public Employee getEmployee(int id);

	public List<Employee> getAllEmployees();

	public List<Employee> getEmployeesByName(String name);

}
