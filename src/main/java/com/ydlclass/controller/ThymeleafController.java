package com.ydlclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
    @GetMapping("index")
    public String index(Model model){
        int i =1/0;
        model.addAttribute("msg","hello thymeleaf");
        return "index";
    }
}
