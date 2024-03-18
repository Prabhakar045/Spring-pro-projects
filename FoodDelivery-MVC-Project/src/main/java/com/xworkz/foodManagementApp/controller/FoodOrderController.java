package com.xworkz.foodManagementApp.controller;

import com.xworkz.foodManagementApp.dto.FoodOrderDTO;
import com.xworkz.foodManagementApp.service.FoodOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class FoodOrderController {

    @Autowired
    private FoodOderService foodOderService;

    @PostMapping("register")
    public String saveFoodOderdetails(@ModelAttribute FoodOrderDTO foodOrderDTO, Model model){

        foodOderService.saveFoodOrderDetails(foodOrderDTO);

        model.addAttribute("message", "food ordered successfully");

        return "register";
    }

    @GetMapping("FoodOrderList")
    String getAllFoodOrderDetails(Model model){

        List<FoodOrderDTO> orderDetails = foodOderService.getAllFoodOrderDetails();
        System.out.println("my order :" + orderDetails);
         model.addAttribute("orderDetails", orderDetails);
        return  "foodOrderList";
    }

//    @GetMapping("edit")
//    String getFoodOrderdetailsById(@RequestParam int id, Model model){
//        System.out.println("getFoodOrderDetailsById");
//        FoodOrderDTO foodOrderDTO = foodOderService.getFoodOrderDetailsById(id);
//        model.addAttribute("foodOrderDTO", foodOrderDTO);
//        return  "updateFoodOrder";
//    }

       @GetMapping("edit")
      String getFoodOrderdetailsById(@RequestParam int id, Model model){
        FoodOrderDTO  foodOrderDTO  = foodOderService.getFoodOrderDetailsById(id);
        model.addAttribute("foodOrderDTO",foodOrderDTO);

        return "updateFoodOrder";
      }

//    @PostMapping("update")
//    String updateFoodOrderDetailsById(@RequestParam int id, FoodOrderDTO foodOrderDTO, Model model){
//        foodOderService.updateFoodOrderById(id, foodOrderDTO);
//        model.addAttribute("message", "food details updated successfully");
//        return "foodOrderList";
//    }

    @PostMapping("update")
    String updateFoodOrderDetailsById(@RequestParam int id, FoodOrderDTO foodOrderDTO ,Model  model){
        foodOderService.updateFoodOrderById(id,foodOrderDTO);
        model.addAttribute("message","order details updated successfully");
        return "foodOrderList";
    }

    @GetMapping("delete")
    public String deleteFoodOrderById(@RequestParam int id, Model model){

        FoodOrderDTO foodOrderDTO = foodOderService.deleteFoodOrderById(id);
        model.addAttribute("message","deleted successfully");
        return "foodOrderList";
    }

}
