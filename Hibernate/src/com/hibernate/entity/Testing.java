package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "testing")
public class Testing {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "user_id")
	private String userId;
	@Column(name = "movie_id")
	private String movieId;
	@Column(name = "rating")
	private String rat;

	public Testing() {
	}

	public Testing(int id, String userId, String movieId, String rat) {
		this.id = id;
		this.userId = userId;
		this.movieId = movieId;
		this.rat = rat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getRat() {
		return rat;
	}

	public void setRat(String rat) {
		this.rat = rat;
	}

	@Override
	public String toString() {
		return "MovieRatings [id=" + id + ", userId=" + userId + ", movieId=" + movieId + ", rat=" + rat + "]";
	}
	

	

	
	

}
