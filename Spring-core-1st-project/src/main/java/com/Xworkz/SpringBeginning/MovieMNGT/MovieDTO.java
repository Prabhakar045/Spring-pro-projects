package com.Xworkz.SpringBeginning.MovieMNGT;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class MovieDTO {

    @Value("1123")
    private long movieId;
    @Value("Animal")
    private String title;
    @Value("2023")
    private int releaseYear;
    @Value("Action")
    private String genre;
    @Value("8")
    private double averageRating;

    @Autowired
    private ReviewDTO reviews;
}
