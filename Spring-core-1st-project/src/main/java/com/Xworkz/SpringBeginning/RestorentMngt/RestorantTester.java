package com.Xworkz.SpringBeginning.RestorentMngt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RestorantTester {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.Xworkz.SpringBeginning");
        RestorantDTO restorantDTO = applicationContext.getBean(RestorantDTO.class);

        System.out.println(restorantDTO);
    }
}
