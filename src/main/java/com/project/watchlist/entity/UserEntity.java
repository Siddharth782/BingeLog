package com.project.watchlist.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.UUID)
	private Long id;
	
	@Column(unique=true, nullable=false)
	private String userName;
	
	@Column(unique=true, nullable=false)
	private String email;
	
	private String password;
	
	private String fullName;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private List<MovieEntity> movies;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private List<SeriesEntity> series;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private List<AnimeEntity> animes;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<MovieEntity> getMovies() {
		return movies;
	}

	public void setMovies(List<MovieEntity> movies) {
		this.movies = movies;
	}

	public List<SeriesEntity> getSeries() {
		return series;
	}

	public void setSeries(List<SeriesEntity> series) {
		this.series = series;
	}

	public List<AnimeEntity> getAnimes() {
		return animes;
	}

	public void setAnimes(List<AnimeEntity> animes) {
		this.animes = animes;
	}
	
	
}
