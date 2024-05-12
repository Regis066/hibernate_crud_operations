package services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import conf.SessionFactoryProvider;
import models.Course;
import models.Student;

public class Create {

	public static void main(String[] args) {

		SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		Student st1 = new Student("Regis", 15);

		Course c1 = new Course("Java", st1);
		Course c2 = new Course("Math", st1);
		Course c3 = new Course("Science", st1);

		st1.getCourses().add(c1);
		st1.getCourses().add(c2);
		st1.getCourses().add(c3);

		session.persist(st1);
		t.commit();
		sessionFactory.close();

	}

}
