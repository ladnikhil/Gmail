package com.dev.ustglobal.jpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteRecord {

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

			String jpql = "delete from Movie where name =:nm";

			Query qu = em.createQuery(jpql);
			
			
			System.out.println("enter the name to be deleted");
			String name = sc.nextLine();
			qu.setParameter("nm",name);// to dynamicallly pass values 



			int result = qu.executeUpdate();
			System.out.println("data has been deleted");

			tr.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
