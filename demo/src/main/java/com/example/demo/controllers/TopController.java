package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 */
@Controller
@RequestMapping("/")
public class TopController {
    /**
     * 
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("tag", "Spring Boot + Thymeleaf入門");
        return "index";
    }

    /**
     * 
     * @param model
     * @return
     */
    @RequestMapping("/top")
    public String top(Model model, String tag1) {
        model.addAttribute("tag1", tag1);
        return "top";
    }
}
