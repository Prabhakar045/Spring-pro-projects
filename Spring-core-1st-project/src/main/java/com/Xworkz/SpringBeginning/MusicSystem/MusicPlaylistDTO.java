package com.Xworkz.SpringBeginning.MusicSystem;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class MusicPlaylistDTO {

    @Autowired
    private SongDTO songs;

    @Value("faverite")
    private String playlistName;
    @Value("pbk")
    private String createdByUser;
    @Value("yes")
    private boolean isPublic;
    @Value("on loop")
    private String description;
}
