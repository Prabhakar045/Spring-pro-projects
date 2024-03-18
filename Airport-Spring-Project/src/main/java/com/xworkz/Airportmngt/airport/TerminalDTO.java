package com.xworkz.Airportmngt.airport;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component("terminal")
//@Scope(value = "prototype")
public class TerminalDTO {

//    @Value("1323")
    private  int terminalId;

    @Value("Terminal 2")
    private String name;

    public TerminalDTO(){
        System.out.println("TerminalDTO Bean Object is created.");
    }
}
