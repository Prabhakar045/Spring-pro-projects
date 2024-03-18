package com.Xworkz.SpringBeginning.BlogMngt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BlogTester {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.Xworkz.SpringBeginning");

        BlogDTO blog = context.getBean(BlogDTO.class);

        System.out.println(blog);
    }
}
