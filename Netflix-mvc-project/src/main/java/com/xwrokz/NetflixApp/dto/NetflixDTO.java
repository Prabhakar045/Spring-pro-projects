package com.xwrokz.NetflixApp.dto;

import lombok.Data;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.persistence.*;

@Entity
@Data
@Table(name = "netflix")

public class NetflixDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String actor;
    private int releaseYear;
    private String genre;
    private boolean available;
}
