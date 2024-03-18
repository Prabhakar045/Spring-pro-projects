package com.Xworkz.SpringBeginning.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class AddressDTO {

    @Value("#1")
    private String houseNo;

    @Value("Rjajinagara")
    private String area;

    @Value("Bnagalore")
    private String city;

    @Value("karnataka")
    private String state;

    @Value("India")
    private String country;

    @Value("646235")
    private  int pincode;
}
