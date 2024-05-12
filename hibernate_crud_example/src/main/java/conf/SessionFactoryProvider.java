package conf;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Course;
import models.Student;

public class SessionFactoryProvider {
	public static SessionFactory provideSessionFactory() {
		Configuration config = new Configuration();
		config.addAnnotatedClass(Student.class);
		config.addAnnotatedClass(Course.class);
		return config.buildSessionFactory();
	}
}
