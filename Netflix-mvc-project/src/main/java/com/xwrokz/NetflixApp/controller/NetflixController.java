package com.xwrokz.NetflixApp.controller;

import com.xwrokz.NetflixApp.dto.NetflixDTO;
import com.xwrokz.NetflixApp.service.NetflixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class NetflixController {


    @Autowired
    private NetflixService netflixService;



    @PostMapping("saveNetflix")
    String addNewNetflixCOntent(@ModelAttribute NetflixDTO netflixDTO, Model model){
        System.out.println("controller");
        netflixService.addNewNetflixCOntent(netflixDTO);
        model.addAttribute("message","New content added successfully");

        return "addContent";
    }
}
