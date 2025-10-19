package com.project.watchlist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimeDTO {
	private Long id;
	private String title;
	private String genre;
	private int releaseYear;
	private int episodes;
	private int episodesSeen;
	private String status;
	private double rating;
	private Long userId;
}
