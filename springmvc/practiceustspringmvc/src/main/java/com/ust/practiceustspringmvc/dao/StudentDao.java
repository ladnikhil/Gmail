package com.ust.practiceustspringmvc.dao;

import java.util.List;

import com.ust.practiceustspringmvc.dto.Student;

public interface StudentDao {
	
	public Student authenticate(String email,String password);
	
	public boolean registerStudent(Student student);
	
	public boolean deleteStudent(int id);
	
	public boolean updateStudent(Student student);
	
	public List<Student> getStudents();

}
