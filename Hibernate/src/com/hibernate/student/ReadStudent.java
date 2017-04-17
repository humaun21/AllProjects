package com.hibernate.student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.entity.Student;
public class ReadStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create session factory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			Student tempStudent = new Student("Nayan", "Rashid", "nayan.rashid@gmail.com");
			session.beginTransaction();
			System.out.println("tempStudent" + tempStudent);
			session.save(tempStudent);
			session.getTransaction().commit();
			//session.close();

			System.out.println("Current student primary Key:" + tempStudent.getId());
			session = factory.getCurrentSession();
			session.beginTransaction();
			System.out.println("\nGetting Student based on Id:" + tempStudent.getId());
			Student myStudent = session.get(Student.class, tempStudent.getId());
			System.out.println("Getting Student:" + myStudent);
			session.getTransaction().commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
