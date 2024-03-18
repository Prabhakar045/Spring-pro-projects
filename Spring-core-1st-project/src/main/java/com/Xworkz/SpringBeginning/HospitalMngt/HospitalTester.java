package com.Xworkz.SpringBeginning.HospitalMngt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HospitalTester {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.Xworkz.SpringBeginning");
        HospitalDTO hospitalDTO = context.getBean(HospitalDTO.class);

        System.out.println(hospitalDTO);
    }
}
