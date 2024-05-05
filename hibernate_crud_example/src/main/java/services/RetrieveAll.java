package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import conf.SessionFactoryProvider;
import models.Student;

public class RetrieveAll {

	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		String hql = "FROM Student";
		Query<Student> query = session.createQuery(hql, Student.class);
		List<Student> students = query.list();

		for (Student st : students) {
			System.out.println("ID: " + st.getId());
			System.out.println("Name: " + st.getName());
			System.out.println("Grade: " + st.getStd());
			System.out.println("---------------------------------");
		}
		t.commit();
		sessionFactory.close();
	}
}
