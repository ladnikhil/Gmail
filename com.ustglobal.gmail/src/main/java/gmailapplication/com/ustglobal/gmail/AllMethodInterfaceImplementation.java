package gmailapplication.com.ustglobal.gmail;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AllMethodInterfaceImplementation implements AllMethodInterface{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {


	}

	public void compose() {

		Account a = new Account();
		System.out.println("enter the emailid");
		String email = sc.nextLine();
		a.setEmail(email);

		Inbox i = new Inbox();
		System.out.println("enter the message");
		String message = sc.nextLine();
		i.setMessage(message);


		a.setInb(i);


		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr = null;

		try {

			emf  = Persistence.createEntityManagerFactory("TestPersistenceaccount");
			em  = emf.createEntityManager();
			tr = em.getTransaction();

			tr.begin();
			em.persist(a);

			System.out.println("data has been saved and stored in database");

			tr.commit();

		}catch (Exception e) {
			e.printStackTrace();		}

	}

	public void showinbox() {


		EntityManagerFactory emf = null;

		EntityManager em = null;

		EntityTransaction tr = null;

		try {


			emf = Persistence.createEntityManagerFactory("TestPersistenceinbox");

			em = emf.createEntityManager();

			String jpql = "select Email from Account";

			Query qu = em.createQuery(jpql);




			List<String> rl =  qu.getResultList();// asname is written in string type


			for(String s: rl) {

				System.out.println("Email is"+s);
				System.out.println("==============================");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}






	}

	public void register() {

		Account a = new Account();

		System.out.println("enter the userid ");
		int userid = sc.nextInt();
		a.setUser_Id(userid);

		System.out.println("enter the username");
		String username = sc.nextLine();
		a.setUser_Name(username);

		System.out.println("enter the password");
		String password = sc.nextLine();
		a.setPassword(password);

		System.out.println("enter the emailid");
		String email = sc.nextLine();
		a.setEmail(email);

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr = null;

		try {

			emf  = Persistence.createEntityManagerFactory("TestPersistenceaccount");
			em  = emf.createEntityManager();
			tr = em.getTransaction();

			tr.begin();
			em.persist(a);
			System.out.println("registration successful");

			tr.commit();


		} catch (Exception e) {
			e.printStackTrace();
		}




	}

	public void login() {

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr = null;

		try {
			
			Account ac = new Account();
			Account ac1 = new Account();
			

			emf = Persistence.createEntityManagerFactory("TestPersistenceaccount");
			em = emf.createEntityManager();
			tr = em.getTransaction();

			tr.begin();

			System.out.println("enter ur credentials to login");

			System.out.println("enter the emailid");
			
			int id = sc.nextInt();


			System.out.println("enter the password ");
			String password = sc.nextLine();
			
			ac = em.find(Account.class, id);
			

			System.out.println("u have succcessfully login");
			
			System.out.println("******************************");
			System.out.println(ac.getEmail()+" has successfully login");
			

			tr.commit();


		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
