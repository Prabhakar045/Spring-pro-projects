package com.Xworkz.SpringBeginning.RestorentMngt;

import org.springframework.beans.factory.annotation.Value;

public class MenuDTO {

    @Value("1")
    private int itemId;

    @Value("Burger")
    private String itemName;

    @Value("250.00")
    private double price;
}
