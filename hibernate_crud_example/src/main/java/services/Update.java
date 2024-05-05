package services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import conf.SessionFactoryProvider;
import models.Student;

public class Update {

	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		Student student = session.get(Student.class, 1);
		student.setStd(15);
		session.persist(student);
		t.commit();

		sessionFactory.close();

	}

}
