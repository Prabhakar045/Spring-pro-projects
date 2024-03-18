package com.Xworkz.SpringBeginning.BlogMngt;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class BlogDTO {

    @Value("12")
    private int blogId;
    @Value("coding blog")
    private String title;
    @Value("Code")
    private String content;

    @Autowired
    private CommentDTO comments;
}
