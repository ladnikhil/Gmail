package com.ust.ustspringrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ust.ustspringrest.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addEmployeee(Employee employee) {
		
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		tr.begin();
		try {
		em.persist(employee);
		tr.commit();
		return true;
		}catch (Exception e) {
			return false;
		}
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
	public boolean removeEmployeee(int id) {
		
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
	public boolean modifyEmployeee(Employee employee) {
		
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
	public Employee getEmployee(int id) {
	
		EntityManager em = factory.createEntityManager();
		//EntityTransaction tr = em.getTransaction();
		
		return em.find(Employee.class, id);
		
		//tr.commit();
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		String jpql = "from Employee";
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(jpql);
		List<Employee> employees = query.getResultList();
		return employees;
	}

}
