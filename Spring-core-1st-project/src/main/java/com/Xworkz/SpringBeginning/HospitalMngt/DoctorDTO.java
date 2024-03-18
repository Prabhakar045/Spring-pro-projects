package com.Xworkz.SpringBeginning.HospitalMngt;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class DoctorDTO {

    @Value("34")
    private long doctorId;
    @Value("shekhar")
    private String name;
    @Value("mantra")
    private String specialization;
}
