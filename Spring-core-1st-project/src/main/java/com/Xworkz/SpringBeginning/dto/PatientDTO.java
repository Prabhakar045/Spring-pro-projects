package com.Xworkz.SpringBeginning.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class PatientDTO {

    @Value("1")
    private int id;

    @Value("Shekhar")
    private String patientName;

    @Value("8413310277")
    private long contactNo;

    @Autowired
    private AddressDTO address;


}
