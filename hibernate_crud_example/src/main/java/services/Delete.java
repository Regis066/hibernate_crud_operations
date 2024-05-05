package services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import conf.SessionFactoryProvider;
import models.Student;

public class Delete {

	public static void main(String[] args) {

		SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		Student s = session.get(Student.class, 1);
		session.remove(s);
		t.commit();

		sessionFactory.close();
	}
}
