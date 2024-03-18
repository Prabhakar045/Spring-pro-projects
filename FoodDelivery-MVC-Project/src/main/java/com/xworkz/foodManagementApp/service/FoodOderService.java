package com.xworkz.foodManagementApp.service;

import com.xworkz.foodManagementApp.dto.FoodOrderDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoodOderService {

    void  saveFoodOrderDetails(FoodOrderDTO foodOrderDTO);

    List<FoodOrderDTO> getAllFoodOrderDetails();

    FoodOrderDTO getFoodOrderDetailsById(int id);

    FoodOrderDTO updateFoodOrderById(int id, FoodOrderDTO foodOrderDTO);

    public FoodOrderDTO deleteFoodOrderById(int id);
}
