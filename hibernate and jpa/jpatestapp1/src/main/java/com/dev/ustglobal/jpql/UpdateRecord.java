package com.dev.ustglobal.jpql;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateRecord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		EntityManagerFactory emf = null;

		EntityManager em = null;

		EntityTransaction tr = null;
		
		

		try {

			emf = Persistence.createEntityManagerFactory("TestPersistence");

			em = emf.createEntityManager();

			tr = em.getTransaction();

			tr.begin();

			String jpql = "update Movie set name =:nm where id =:id";

			Query qu = em.createQuery(jpql);
			
			
			System.out.println("enter the name to be updated");
			String name = sc.nextLine();
			qu.setParameter("nm",name);// to dynamicallly pass values 
			
	
			System.out.println("enter the id to be updated");
			int id = sc.nextInt();
			qu.setParameter("id",id);// to dynamicallly pass values 
			
			int result = qu.executeUpdate();
			System.out.println("data has been updated");
			
			
			tr.commit();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
