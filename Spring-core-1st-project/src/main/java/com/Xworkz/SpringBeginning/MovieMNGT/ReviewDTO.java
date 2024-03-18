package com.Xworkz.SpringBeginning.MovieMNGT;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ReviewDTO {

    @Value("10")
    private long reviewId;

    @Value("Pbk")
    private String reviewerName;

    @Value("9")
    private int rating;

    @Value("Excellent movie!")
    private String comment;
}
