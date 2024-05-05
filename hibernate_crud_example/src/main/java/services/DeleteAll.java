package services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import conf.SessionFactoryProvider;

public class DeleteAll {

	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		String sql = "TRUNCATE TABLE students";
		int rowsAffected = session.createNativeMutationQuery(sql).executeUpdate();
		System.out.println("Rows affected: " + rowsAffected);

		t.commit();

		sessionFactory.close();
	}

}
