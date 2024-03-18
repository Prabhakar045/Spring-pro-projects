package com.xworkz.foodManagementApp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity

@NamedQueries({
        @NamedQuery(name = "getAllFoodOrderDetails", query = "from FoodOrderDTO dto")

})
@Table(name = "order_details")
public class FoodOrderDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String foodName;
    private int quantity;
    private double price;
    private  String address;
    private  String customerName;
    private   long contactNumber;
}
