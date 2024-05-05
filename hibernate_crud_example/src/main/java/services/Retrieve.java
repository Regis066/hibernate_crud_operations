package services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import conf.SessionFactoryProvider;
import models.Student;

public class Retrieve {

	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
		Session session = sessionFactory.openSession();

		Student s = session.get(Student.class, 1);
		System.out.println("Id : " + s.getId());
		System.out.println("Name : " + s.getName());
		System.out.println("Class : " + s.getStd());

		sessionFactory.close();
	}

}
