package com.Xworkz.SpringBeginning;

import com.Xworkz.SpringBeginning.AirportMngt.AirportDTO;
import com.Xworkz.SpringBeginning.AirportMngt.TerminalDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AirportTester {

    public static void main(String[] args) {
        ApplicationContext  context = new AnnotationConfigApplicationContext("com.Xworkz.SpringBeginning");


        AirportDTO airportDTO = (AirportDTO) context.getBean("airport");


        System.out.println(airportDTO);
    }
}
