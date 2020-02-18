package com.io.hibernatemaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stubrat
		//adding session configurations
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();

		UserDetails user=new UserDetails();
		user.setUserName("first user");

		Address addr1=new Address();
		addr1.setCity("Faridabad");
		addr1.setState("Haryana");
		addr1.setStreet("H.no-286,Friends Enclave");
		addr1.setPincode("121002");

		Address addr2=new Address();
		addr1.setCity("Noida");
		addr1.setState("Uttar Pradesh");
		addr1.setStreet("A-67");
		addr1.setPincode("101103");

		user.getUserAddress().add(addr1);
		user.getUserAddress().add(addr2);

		session.save(user);

		session.getTransaction().commit();

		session.close();
	}

}
