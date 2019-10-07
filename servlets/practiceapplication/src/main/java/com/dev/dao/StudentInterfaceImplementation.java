package com.dev.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dev.bean.StudentBean;
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

public class StudentInterfaceImplementation implements StudentInterface {

	public static void main(String[] args) {

	}

	@Override
	public StudentBean login(int id, String password) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		StudentBean studentbean = null;

		String jpaquery = "from StudentBean where id = :id and password = :pwd";
		Query query = em.createQuery(jpaquery);
		query.setParameter("id", id);
		query.setParameter("pwd", password);

		try {
			studentbean = (StudentBean) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return studentbean;

	}

	@Override
	public StudentBean searchstudent(int id) {

		EntityManagerFactory emf = null;
		EntityManager em = null;

		StudentBean studentbean = null;
		try {

			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();

			studentbean = em.find(StudentBean.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return studentbean;
	}

	@Override
	public void addStudent(StudentBean bean) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();

		if (em != null) {
			tr.begin();
			em.persist(bean);
			tr.commit();

		}

	}

	@Override
	public void updateStudent(int id, String name, int age, String password) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		StudentBean bean = null;

		if (em != null) {
			tr.begin();

			bean = em.find(StudentBean.class, id);

			bean.setAge(age);
			bean.setName(name);
			bean.setPassword(password);

			em.persist(bean);
			tr.commit();

		}

	}

	@Override
	public void deleteStudent(int id) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
	
		StudentBean bean = null;

		if (em != null) {
			tr.begin();

			bean = em.find(StudentBean.class, id);
			
			em.remove(bean);
			tr.commit();
		}
		
	}

}
