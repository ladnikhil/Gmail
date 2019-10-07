package com.ust.practiceustspringmvc.service;

import java.util.List;

import com.ust.practiceustspringmvc.dto.Student;

public interface StudentService {
	
public Student authenticate(String email,String password);
	
	public boolean registerStudent(Student student);
	
	public boolean deleteStudent(int id);
	
	public boolean updateStudent(Student student);
	
	public List<Student> getStudents();
	
	

}
