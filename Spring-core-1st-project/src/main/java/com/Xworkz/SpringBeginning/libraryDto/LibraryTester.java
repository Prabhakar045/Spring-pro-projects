package com.Xworkz.SpringBeginning.libraryDto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryTester {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.Xworkz.SpringBeginning");

        LibraryDTO libraryDTO = context.getBean(LibraryDTO.class);
        BooksDTO booksDTO = context.getBean(BooksDTO.class);

        System.out.println(libraryDTO);
    }
}
