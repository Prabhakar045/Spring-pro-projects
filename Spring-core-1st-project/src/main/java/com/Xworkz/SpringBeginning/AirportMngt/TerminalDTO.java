package com.Xworkz.SpringBeginning.AirportMngt;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component("terminal")
public class TerminalDTO {

    @Value("2")
    private  int terminalId;
    @Value("Terminal 2")
    private String name;
}
