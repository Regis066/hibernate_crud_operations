package services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import conf.SessionFactoryProvider;
import models.Student;

public class Create {

	public static void main(String[] args) {

		SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		Student st1 = new Student("John", 10);

		session.persist(st1);
		t.commit();
		sessionFactory.close();

	}

}
