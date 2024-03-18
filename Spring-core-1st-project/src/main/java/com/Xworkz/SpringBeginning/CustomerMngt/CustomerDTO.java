package com.Xworkz.SpringBeginning.CustomerMngt;

import com.Xworkz.SpringBeginning.Ecommerce.Order;
import com.Xworkz.SpringBeginning.Ecommerce.ProductDTO;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class CustomerDTO {

    @Value("21")
    private long customerId;
    @Value("shekhar")
    private String name;
    @Autowired
    private Order orders;
    @Autowired
    private ProductDTO productDTO;
}
