package com.Xworkz.SpringBeginning.MusicSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MusicPlaylistTester {

    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext("com.Xworkz.SpringBeginning");
        MusicPlaylistDTO music = context.getBean(MusicPlaylistDTO.class);

        System.out.println(music);
    }
}
