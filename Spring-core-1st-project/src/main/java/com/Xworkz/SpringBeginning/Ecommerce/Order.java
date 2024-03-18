package com.Xworkz.SpringBeginning.Ecommerce;

import com.Xworkz.SpringBeginning.dto.AddressDTO;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Order {

    @Value("1")
    private  int orderId;
    @Value("flipcart")
    private String ecommercePlatform;
    @Value("3")
    private  int noOfOrders;
    @Autowired
    private AddressDTO addressDTO;
    @Autowired
    private ProductDTO productDTO;


}
