package com.ust.practiceustspringmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ust.practiceustspringmvc.dto.Student;


@Repository
public class StudentDaoImpl implements StudentDao{
	
	@PersistenceUnit
	private EntityManagerFactory emf;
	

	@Override
	public Student authenticate(String email, String password) {
		
		String jpql = "from Student where email = :em and password = :pwd";
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(jpql);
		query.setParameter("em", email);
		query.setParameter("pwd", password);
		
		try {
			 return (Student) query.getSingleResult();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

	@Override
	public boolean registerStudent(Student student) {
		

		if (checkEmail(student.getEmail())) {
			return false;
		}
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		tr.begin();
		em.persist(student);
		tr.commit();
		return true;
	}

	private boolean checkEmail(String email) {

		String jpql = "from Student where email = :email";
		EntityManager manager = emf.createEntityManager();
		Query query = manager.createQuery(jpql);
		query.setParameter("email", email);
		try {
			query.getSingleResult();
			return true;
		}catch (Exception e) {
			return false;
		}
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
