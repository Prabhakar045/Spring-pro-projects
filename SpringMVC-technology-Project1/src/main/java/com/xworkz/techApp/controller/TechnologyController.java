package com.xworkz.techApp.controller;

import com.xworkz.techApp.dto.TechnologyDTO;
import com.xworkz.techApp.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
public class TechnologyController {

    @Autowired
    private TechnologyService service;

    @PostMapping("register")
    public String saveTechnology(@ModelAttribute @Valid TechnologyDTO technologyDTO, BindingResult errors, Model view) {  //@Value

        if (errors.hasErrors()){
            System.out.println("is DTO has errors:" +errors.hasErrors());
            List<ObjectError> listErrors = errors.getAllErrors();

            for(ObjectError objectError: listErrors){
                System.out.println(objectError.getDefaultMessage());
            }
            view.addAttribute("errors", listErrors);

            return "register";
        }

        view.addAttribute("message", "Technology saved successfully");
        view.addAttribute("technologyName", technologyDTO.getTechnologyName());


        service.validateAndSave(technologyDTO);

        return "response";
    }

    @GetMapping("technologiesList")
    public String getAllTechnologies(Model view) {
        List<TechnologyDTO> technologies = service.getAllInfo();

        view.addAttribute("technologies", technologies);

//        return "technologyList";
        return "{\"status\":\"ok\"}";
    }

//    @GetMapping("technology")
//    public String getTechnologyById(@PathVariable int id, Model view) {
//        TechnologyDTO technologyDTO = service.getInfoById(id);
//
//        view.addAttribute("technology", technologyDTO);
//
//        return "technology";
//    }

    @GetMapping("edit")
    public String editTechnology(@RequestParam int id, Model view) {
        TechnologyDTO technologyDTO = service.getInfoById(id);

        view.addAttribute("technology", technologyDTO);

        return "updateTechnology";
    }

    @PostMapping("updateTechnology")
    public String updateTechnology(@RequestParam int id, @ModelAttribute TechnologyDTO technologyDTO, Model view) {
        TechnologyDTO updatedDTO = service.updateInfoById(id, technologyDTO);

        view.addAttribute("message", "Technology updated successfully");
        view.addAttribute("technologyName", updatedDTO.getTechnologyName());
        view.addAttribute("technologyVersion", updatedDTO.getVersion());

        return getAllTechnologies(view);
    }

    @GetMapping("delete")
    public String deleteTechnology(@RequestParam int id, Model view) {
        TechnologyDTO deletedDTO = service.deleteUserById(id);

        view.addAttribute("message", "Technology deleted successfully");
        view.addAttribute("technologyName", deletedDTO.getTechnologyName());
        view.addAttribute("technologyVersion", deletedDTO.getVersion());

        return "response";
    }
}
