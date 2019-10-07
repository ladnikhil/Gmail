package com.ust.ustspringmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ust.ustspringmvc.dto.Employee;

@Repository                                       // in sort it is a component
public class EmployeeDaoImpl implements EmployeeDao {
	
	@PersistenceUnit                             // same as autowire but we use here so we have used @persistanceunit because it creates only one object of persistence unit
	private EntityManagerFactory factory;

	@Override
	public Employee auth(String email, String password) {

		String jpql = "from Employee where email = :email and password = :pwd";
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(jpql);
		query.setParameter("email", email);
		query.setParameter("pwd", password);
		try {
			
		return (Employee) query.getSingleResult();
		
		}catch(Exception e) {
			return null;
		}

		
	}

	@Override
	public boolean registerEmployee(Employee employee) {

		if (checkEmail(employee.getEmail())) {
			return false;
		}

		EntityManager em = factory.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		tr.begin();
		em.persist(employee);
		tr.commit();
		return true;
	}

	private boolean checkEmail(String email) {

		String jpql = "from Employee where email = :email";
		EntityManager manager = factory.createEntityManager();
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
	public boolean deleteEmployee(int id) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		tr.begin();
		Employee employee = em.find(Employee.class, id);

		if (employee == null) {
			return false;
		}
		em.remove(employee);
		tr.commit();
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		Employee emp = em.find(Employee.class, employee.getId());
		
		if(emp==null) 
			return false;
		
		emp.setName(employee.getName());
		emp.setDob(employee.getDob());
		emp.setPassword(employee.getPassword());
		tr.begin();
		em.persist(emp);
		tr.commit();
		return true;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		String jpql = "from Employee";
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(jpql);
		List<Employee> employees = query.getResultList();
		return employees;
	}

}
