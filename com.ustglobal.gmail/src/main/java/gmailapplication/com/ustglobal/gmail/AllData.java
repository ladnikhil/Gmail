package gmailapplication.com.ustglobal.gmail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AllData {

	public static void main(String[] args) {

		Account a = new Account();
		a.setUser_Id(3);
		a.setUser_Name("rohan");
		a.setUser_Name("rohan@gmail.com");
		a.setPassword("123");
		a.setEmail("rohan@gmail.com");

		Account a1 = new Account();
		a1.setUser_Id(4);
		a1.setUser_Name("rahul");
		a1.setUser_Name("rahul@gmail.com");
		a1.setPassword("123");
		a1.setEmail("rahul@gmail.com");

		Inbox ib = new Inbox();
		ib.setMessage_Id(103);
		ib.setUser_Id(30);
		ib.setMessage("thank you");

		Inbox ib1 = new Inbox();
		ib1.setMessage_Id(104);
		ib1.setUser_Id(40);
		ib1.setMessage("thank you");



		a.setInb(ib);
		a1.setInb(ib1);

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr = null;

		try {

			emf  = Persistence.createEntityManagerFactory("TestPersistenceaccount");
			em  = emf.createEntityManager();
			tr = em.getTransaction();

			tr.begin();
			em.persist(a);
			em.persist(a1);

			System.out.println("data has been saved");

			tr.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}









	}

}
