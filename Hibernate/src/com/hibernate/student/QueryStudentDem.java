package com.hibernate.student;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.entity.Student;
public class QueryStudentDem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create session factory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			@SuppressWarnings({ "deprecation", "unchecked" })
			List<Student> theStudents = session.createQuery("select E.first_name from Student as E ").list();
			System.out.println("theStudents:"+theStudents);
			
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
