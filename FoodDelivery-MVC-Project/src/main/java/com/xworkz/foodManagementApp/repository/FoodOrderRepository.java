package com.xworkz.foodManagementApp.repository;

import com.xworkz.foodManagementApp.dto.FoodOrderDTO;

import java.util.List;

public interface FoodOrderRepository {

    void  saveFoodOrderDetails(FoodOrderDTO foodOrderDTO);

     List<FoodOrderDTO> getAllFoodOrderDetails();

     FoodOrderDTO getFoodOrderDetailsById(int id);

     FoodOrderDTO updateFoodOrderById(int id, FoodOrderDTO foodOrderDTO);

     FoodOrderDTO deleteFoodOrderById(int id);

}
