package com.xworkz.Airportmngt.airport;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component("airport")
//@Scope(value = "prototype")   // Scope - to manage data - 5 scopes (Singleton, prototype, session , request, global)
public class AirportDTO {



//    @Value("45")

    private int airportId;

    @Value("Kempegouda international airport")
    private String name;

    @Autowired
    private TerminalDTO terminal;

    public  AirportDTO(){
        System.out.println("AirportDTO Bean Object is created.");
    }

    //constructor initialization
//    @Autowired
//    public AirportDTO( @Value("45") int airportId, @Value("Kempegouda international airport") String name, TerminalDTO terminal){
//             System.out.println("AirportDTO Bean Object is created by invoking parameterized constructor.");
//        this.airportId=airportId;
//        this.name=name;
//        this.terminal=terminal;
//    }


 /*   @Override
    public String toString() {
        return "AirportDTO{" +
                "airportId=" + airportId +
                ", name='" + name + '\'' +
                ", terminal=" + terminal +
                '}';
    }
 */
}
