package com.project.watchlist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeriesDTO {
    private Long id;
    private String title;
    private int seasons;
    private String genre;
	private int releaseYear;
	private String status;
    private double rating;
    private Long userId;
}