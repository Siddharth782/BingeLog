package com.project.watchlist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {
    private Long id;
    private String title;
    private String genre;
    private int releaseYear;
    private double rating;
    private String status;

    private Long userId;
}
