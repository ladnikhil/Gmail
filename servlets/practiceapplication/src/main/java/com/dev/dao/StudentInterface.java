package com.dev.dao;

import com.dev.bean.StudentBean;

public interface StudentInterface {
	
	public StudentBean login(int id,String password);
	
	public StudentBean searchstudent(int id);
	
	public void addStudent(StudentBean bean);
	
	public void updateStudent(int id,String name,int age,String password);
	
	public void deleteStudent(int id);

}
