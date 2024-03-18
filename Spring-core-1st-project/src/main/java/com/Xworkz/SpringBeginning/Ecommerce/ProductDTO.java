package com.Xworkz.SpringBeginning.Ecommerce;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class ProductDTO {

    @Value("111")
    private  int productId;
    @Value("iphone 15 max pro")
    private String productName;
    @Value("125000.00")
    private double price;

}
