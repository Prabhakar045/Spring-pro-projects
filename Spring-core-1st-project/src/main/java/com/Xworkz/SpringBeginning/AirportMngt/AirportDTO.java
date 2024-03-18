package com.Xworkz.SpringBeginning.AirportMngt;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component("airport")
public class AirportDTO {

    @Value("45")
    private long airportCode;
    @Value("Kempegouda international airport")
    private String name;
    @Autowired
    private TerminalDTO flights;
}
