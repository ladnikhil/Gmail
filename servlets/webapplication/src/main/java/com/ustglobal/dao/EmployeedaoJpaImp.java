package com.ustglobal.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

public class EmployeedaoJpaImp implements EmployeeDao {

	@Override
	public EmployeeInfoBean searchEmployee(int id) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = emf.createEntityManager();
		EmployeeInfoBean employeeinfobean = null;

		try {
			employeeinfobean = manager.find(EmployeeInfoBean.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeinfobean;
	}

	@Override
	public boolean addEmployee(int id, String name, int age, double salary, String designation,String password) {

		EmployeeInfoBean eib = new EmployeeInfoBean();

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr = null;

		try {

			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tr = em.getTransaction();

			eib.setEmpId(id);
			eib.setEmpName(name);
			eib.setAge(age);
			eib.setSalary(salary);
			eib.setDesignation(designation);
			eib.setPassword(password);

			if (em != null) {
				tr.begin();
				em.persist(eib);
				tr.commit();
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			em.close();
			emf.close();
		}

		return false;
	}

	@Override
	public boolean DeleteEmployee(int id) {

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr = null;
		EmployeeInfoBean eb1 = null;

		try {

			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tr = em.getTransaction();

			eb1 = em.find(EmployeeInfoBean.class, id);

			if (em != null) {
				tr.begin();
				em.remove(eb1);
				tr.commit();
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return false;
	}

	@Override
	public boolean updateEmployee(int id, String name, int age, double salary, String designation,String password) {

		EmployeeInfoBean emb = new EmployeeInfoBean();

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr = null;

		try {

			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tr = em.getTransaction();

			emb = em.find(EmployeeInfoBean.class, id);

			emb.setEmpId(id);
			emb.setEmpName(name);
			emb.setAge(age);
			emb.setSalary(salary);
			emb.setDesignation(designation);
			emb.setPassword(password);

			if (em != null) {
				tr.begin();
				em.persist(emb);
				tr.commit();
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}

		return false;
	}

	@Override
	public EmployeeInfoBean login(int empId, String Password) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = emf.createEntityManager();
		EmployeeInfoBean employeeinfobean = null;

		String jpaquery = "from EmployeeInfoBean where empId = :id and password = :pwd";
		Query query = manager.createQuery(jpaquery);
		query.setParameter("id", empId);
		query.setParameter("pwd", Password);

		try {

			employeeinfobean = (EmployeeInfoBean) query.getSingleResult();

		} catch (Exception e) {
			e.printStackTrace();

		}

		return employeeinfobean;

	}

	@Override
	public void addjspemployee(EmployeeInfoBean bean) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(bean);
		transaction.commit();
		
	}

	@Override
	public void deletejspemployee(int id) {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		EmployeeInfoBean bean = manager.find(EmployeeInfoBean.class, id);
		manager.remove(bean);
	
		transaction.commit();
		
		
	}

}
