package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_ratings")
public class MovieRatings {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "user_id")
	private int userId;
	@Column(name = "movie_id")
	private int movieId;
	@Column(name = "rating")
	private int rating;
	public MovieRatings() {
		// TODO Auto-generated constructor stub
	}
	public MovieRatings(int userId, int movieId, int rating) {
		this.userId = userId;
		this.movieId = movieId;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "MovieRatings [id=" + id + ", userId=" + userId + ", movieId=" + movieId + ", rating=" + rating + "]";
	}

}
