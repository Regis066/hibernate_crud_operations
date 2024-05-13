package conf;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.BoardingSchoolStudent;
import models.Course;
import models.DaySchoolStudent;
import models.Student;

public class SessionFactoryProvider {
	public static SessionFactory provideSessionFactory() {
		Configuration config = new Configuration();
		config.addAnnotatedClass(Student.class);
		config.addAnnotatedClass(Course.class);
		config.addAnnotatedClass(DaySchoolStudent.class);
		config.addAnnotatedClass(BoardingSchoolStudent.class);
		return config.buildSessionFactory();
	}
}
