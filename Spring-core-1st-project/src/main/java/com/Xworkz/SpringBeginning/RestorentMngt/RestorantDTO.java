package com.Xworkz.SpringBeginning.RestorentMngt;

import com.Xworkz.SpringBeginning.dto.AddressDTO;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Data
@Component
public class RestorantDTO {

    @Value("1")
    private int id;
    @Value("pbk resto & bar")
    private String name;
    @Autowired
    private AddressDTO addressDTO;
    private MenuDTO menuDTO;

}
