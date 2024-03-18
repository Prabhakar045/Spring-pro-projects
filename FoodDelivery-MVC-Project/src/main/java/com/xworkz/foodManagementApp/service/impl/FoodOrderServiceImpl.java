package com.xworkz.foodManagementApp.service.impl;

import com.xworkz.foodManagementApp.dto.FoodOrderDTO;
import com.xworkz.foodManagementApp.repository.FoodOrderRepository;
import com.xworkz.foodManagementApp.service.FoodOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodOrderServiceImpl implements FoodOderService {

    @Autowired
    private FoodOrderRepository foodOrderRepository;

    public void saveFoodOrderDetails(FoodOrderDTO foodOrderDTO) {
            foodOrderRepository.saveFoodOrderDetails(foodOrderDTO);
    }

    public List<FoodOrderDTO> getAllFoodOrderDetails() {
        return foodOrderRepository.getAllFoodOrderDetails();
    }

    public FoodOrderDTO getFoodOrderDetailsById(int id) {
        System.out.println("getFoodOrderDetailsById");
        return foodOrderRepository.getFoodOrderDetailsById(id);
    }

    public FoodOrderDTO updateFoodOrderById(int id, FoodOrderDTO foodOrderDTO) {
        return foodOrderRepository.updateFoodOrderById(id, foodOrderDTO);
    }

    public FoodOrderDTO deleteFoodOrderById(int id) {

        return  foodOrderRepository.deleteFoodOrderById(id);
    }
}
