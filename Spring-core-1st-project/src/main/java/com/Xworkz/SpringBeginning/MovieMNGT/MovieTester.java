package com.Xworkz.SpringBeginning.MovieMNGT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MovieTester {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.Xworkz.SpringBeginning");

        MovieDTO movieDTO = context.getBean(MovieDTO.class);

        System.out.println(movieDTO);
    }
}
