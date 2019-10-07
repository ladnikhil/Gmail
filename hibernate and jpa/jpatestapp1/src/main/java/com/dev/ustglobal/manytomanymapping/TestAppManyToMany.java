package com.dev.ustglobal.manytomanymapping;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestAppManyToMany {

	public static void main(String[] args) {

		Course c = new Course();
		c.setCid(30);
		c.setCname("java");
		Course c1 = new Course();
		c1.setCid(40);
		c1.setCname("python");
		ArrayList<Course> al = new ArrayList<Course>();
		al.add(c);
		al.add(c1);

		Student s = new Student();
		s.setSid(3);
		s.setSname("Nikhil");
		s.setCou(al);
		
		Student s1 = new Student();
		s1.setSid(4);
		s1.setSname("sid");
		s1.setCou(al);
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr = null;
		

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistencestudent");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			tr.begin();
			System.out.println("biidirectional");
			
			//em.persist(s);
			//em.persist(s1);
			// bidirectional
			Course cou = em.find(Course.class, 20);
			System.out.println(cou.getCname());


			System.out.println("data has been saved");

			tr.commit();

		} catch (Exception e) {
			//tr.rollback();
			e.printStackTrace();
		}finally{
			if(em!=null) {
				em.close();
			}
		}

	}

}
