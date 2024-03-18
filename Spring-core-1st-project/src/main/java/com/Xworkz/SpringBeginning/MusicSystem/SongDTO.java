package com.Xworkz.SpringBeginning.MusicSystem;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class SongDTO {

    @Value("1")
    private int songId;

    @Value("Imagine")
    private String songName;
}
