package com.ustglobal.dao;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

public interface EmployeeDao {
	
	public EmployeeInfoBean searchEmployee(int id);
	
	public boolean addEmployee(int id,String name,int age,double salary,String designation,String password);
	
	public boolean DeleteEmployee(int id);
	
	public boolean updateEmployee(int id,String name,int age,double salary,String designation,String password);
	
	public EmployeeInfoBean login(int empId,String Password);
	
	public void addjspemployee(EmployeeInfoBean bean);
	
	public void deletejspemployee(int id);
}
