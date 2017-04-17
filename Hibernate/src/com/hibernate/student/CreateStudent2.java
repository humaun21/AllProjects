package com.hibernate.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class CreateStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create session factory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			Student tempStudent = new Student("Fatema0", "Nahid0", "fatema0.nahid@gmail.com");
			Student tempStudent1 = new Student("Fatema1", "Nahid1", "fatema1.nahid@gmail.com");
			Student tempStudent2 = new Student("Fatema2", "Nahid2", "fatema2.nahid@gmail.com");
			Student tempStudent3 = new Student("Fatema3", "Nahid3", "fatema3.nahid@gmail.com");

			session.beginTransaction();
			session.save(tempStudent);
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);

			session.getTransaction().commit();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
