package services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import conf.SessionFactoryProvider;
import models.Address;
import models.BoardingSchoolStudent;
import models.Course;
import models.DaySchoolStudent;
import models.Student;

public class Create {

	public static void main(String[] args) {

		SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		// Student
		Student st1 = new Student("Regis", 15);

		// Course

		Course c1 = new Course("Java", st1);
		Course c2 = new Course("Math", st1);
		Course c3 = new Course("Science", st1);

		List<Course> courses = new ArrayList<>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);

		st1.setCourses(courses);

		// DaySchoolStudent
		DaySchoolStudent ds = new DaySchoolStudent();
		ds.setName("John");
		ds.setStd(13);
		ds.setBusPayment(80000.00);
		ds.setCourses(courses);

		Address daySchoolAddress = new Address();
		daySchoolAddress.setStreet("123 Main Street");
		daySchoolAddress.setCity("Cityville");
		daySchoolAddress.setZipCode("12345");

		ds.setAddress(daySchoolAddress);
		// BoardingSchoolStudent

		BoardingSchoolStudent bs = new BoardingSchoolStudent();
		bs.setName("Mark");
		bs.setStd(13);
		bs.setCourses(courses);

		Address boardingSchoolAddress = new Address();
		boardingSchoolAddress.setStreet("456 Elm Street");
		boardingSchoolAddress.setCity("Townsville");
		boardingSchoolAddress.setZipCode("54321");

		bs.setAddress(boardingSchoolAddress);

		session.persist(st1);
		session.persist(ds);
		session.persist(bs);
		t.commit();
		sessionFactory.close();

	}

}
