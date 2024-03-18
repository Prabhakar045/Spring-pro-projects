package com.Xworkz.SpringBeginning.libraryDto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class BooksDTO {

    @Value("1")
    private  int bookId;
    @Value("The lion King")
    private String bookName;
    @Value("Chetan bhgath")
    private  String author;
    @Value("345")
    private int noOfPages;

}
