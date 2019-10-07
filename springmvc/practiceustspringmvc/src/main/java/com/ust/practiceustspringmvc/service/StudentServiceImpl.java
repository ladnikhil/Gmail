package com.ust.practiceustspringmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.practiceustspringmvc.dao.StudentDao;
import com.ust.practiceustspringmvc.dto.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao dao;
	
	
	@Override
	public Student authenticate(String email, String password) {
		
		return dao.authenticate(email, password);
	}

	@Override
	public boolean registerStudent(Student student) {
		
		if(student.getName()==null || student.getEmail()==null || student.getPassword()==null)
		return false;
		return dao.registerStudent(student);
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
