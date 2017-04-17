package com.hibernate.student;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.entity.MovieRatings;;;
public class QueryStudentDem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create session factory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(MovieRatings.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			@SuppressWarnings({ "unchecked", "deprecation" })
			List<MovieRatings> theStudents = session.createQuery("from MovieRatings").list();
			System.out.println(theStudents);
			System.out.println("\n");

			/*for(MovieRatings tempStudent:theStudents)
			{
				System.out.println(tempStudent);
			}	    */    
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
