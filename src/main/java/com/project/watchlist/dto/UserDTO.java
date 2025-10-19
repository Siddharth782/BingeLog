package com.project.watchlist.dto;

import java.util.List;

import com.project.watchlist.entity.AnimeEntity;
import com.project.watchlist.entity.MovieEntity;
import com.project.watchlist.entity.SeriesEntity;

import lombok.Data;

@Data
public class UserDTO {
	private Long userId;
	private String userName;	
	private String email;
	private String fullName;
	
	private List<MovieEntity> movies;
	private List<SeriesEntity> series;	
	private List<AnimeEntity> animes;
	
}
