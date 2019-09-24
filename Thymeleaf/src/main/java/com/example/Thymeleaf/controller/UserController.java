package com.example.Thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//http://localhost:8080/demo
//Result on browser:  Hello Thymeleaf
//https://www.thymeleaf.org/doc/tutorials/3.0/thymeleafspring.html
//add dependency to pom file


@Controller
public class UserController {

    @RequestMapping(value = "demo", method = RequestMethod.GET)
    public String demo(Model model) {
        model.addAttribute("message", "Hello Thymeleaf");
        // return to templates/demo.html page.
        return "demo";
    }
}