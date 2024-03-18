package com.Xworkz.SpringBeginning.HospitalMngt;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class HospitalDTO {

    @Value("4378")
    private long hospitalId;
    @Value("pbk hospital")
    private String name;
    @Autowired
    private DoctorDTO doctors;
}
