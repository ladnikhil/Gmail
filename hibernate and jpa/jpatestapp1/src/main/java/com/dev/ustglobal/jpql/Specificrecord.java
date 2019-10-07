package com.dev.ustglobal.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dev.jpatestapp1.jpatestapp1.Movie;

public class Specificrecord {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;

		EntityManager em = null;

		EntityTransaction tr = null;

		try {

			emf = Persistence.createEntityManagerFactory("TestPersistence");

			em = emf.createEntityManager();

			String jpql = "select name from Movie";

			Query qu = em.createQuery(jpql);

			List<String> rl =  qu.getResultList();// asname is written in string type


			for(String mov: rl) {
				
				System.out.println("name of movie is"+mov);
				System.out.println("==============================");
			}


		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
