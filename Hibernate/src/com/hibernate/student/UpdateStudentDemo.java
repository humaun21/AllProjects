package com.hibernate.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.entity.Student;

public class UpdateStudentDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create session factory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		try {
			int studentId=1;
			System.out.println("Student Id:: "+studentId);
			Student myStudent=session.get(Student.class, studentId);
			myStudent.setFirstName("Kutni Buri");
			myStudent.setLastName("Kutni buraaaaaaaaaa");

			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
