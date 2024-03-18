package com.Xworkz.SpringBeginning.BlogMngt;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class CommentDTO {

    @Value("11112")
    private int commentId;

    @Value("John Doe")
    private String commenterName;

    @Value("Great post!")
    private String commentText;
}
