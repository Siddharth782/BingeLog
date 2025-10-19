package com.project.watchlist.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="movies")
@NoArgsConstructor
@AllArgsConstructor
public class MovieEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	private Long id;
	
	@Column(nullable=false)
	private String title;
	
	private String genre;
	
	private int releaseYear;
	
	private String status;
	
	private double rating;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
	
	
}
