package com.hibernate.getdata;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.hibernate.entity.MovieRatings;;

public class GetMovieInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(MovieRatings.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			// String hql="select E.user_id, E.rating from MovieRatings as E";
			// System.out.println(hql);
			/*
			 * @SuppressWarnings({ "deprecation", "unchecked" })
			 * List<MovieRatings> theRatings = session.createQuery(hql).list();
			 * System.out.println(theRatings); /*for(MovieRatings
			 * tempRatings:theRatings) {
			 * System.out.println(tempRatings.getUser_id());
			 * System.out.println(tempRatings.getRating()); }
			 */
			String hql = "select E.movie_id, count(E.rating), avg(rating) from MovieRatings E  group by E.movie_id order by E.movie_id asc";
			@SuppressWarnings("rawtypes")
			Query query = session.createQuery(hql);
			@SuppressWarnings({ "unchecked", "deprecation" })
			List<Object[]> result = (List<Object[]>) query.list();
			for (Object[] current : result) {
				Integer movieId = (Integer) current[0];
				Number numberOfRatings = (Number) current[1];
				Number averageRating = (Number) current[2];
				System.out.println(movieId + "," + numberOfRatings +","+averageRating);
			}
			session.getTransaction().commit();
		} catch (Exception e) {

		}

	}

}
