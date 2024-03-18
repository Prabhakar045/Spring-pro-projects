package com.Xworkz.SpringBeginning.libraryDto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Data
@Component
public class LibraryDTO {

    @Value("1")
    private  String id;
    @Value("Ambedkar library")
    private  String name;
    @Value("near Ambedkar ground ")
    private String location;
    @Value("8000")
    private  String noOfBooks;

    @Autowired
    private BooksDTO booksDTO;
}
