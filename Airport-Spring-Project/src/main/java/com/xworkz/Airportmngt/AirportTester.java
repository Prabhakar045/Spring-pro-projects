package com.xworkz.Airportmngt;

import com.xworkz.Airportmngt.airport.AirportDTO;
import com.xworkz.Airportmngt.airport.TerminalDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AirportTester {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.xworkz.Airportmngt");
        System.out.println("ApplicationContext  "+context);

        AirportDTO airportDTO = (AirportDTO) context.getBean("airport");
        airportDTO.setAirportId(1);

        AirportDTO airportDTO1 = (AirportDTO) context.getBean("airport");
        airportDTO1.setAirportId(2);
        AirportDTO airportDTO2 = (AirportDTO) context.getBean("airport");
        airportDTO2.setAirportId(3);

        System.out.println(airportDTO);
        System.out.println(airportDTO1);
        System.out.println(airportDTO2);

        TerminalDTO terminalDTO  = (TerminalDTO) context.getBean("terminal");
        terminalDTO.setTerminalId(1);

        TerminalDTO terminalDTO1  = (TerminalDTO) context.getBean("terminal");
        terminalDTO1.setTerminalId(2);

        TerminalDTO terminalDTO2  = (TerminalDTO) context.getBean("terminal");
        terminalDTO2.setTerminalId(3);

        System.out.println(terminalDTO);
        System.out.println(terminalDTO1);
        System.out.println(terminalDTO2);
    }
}
