package com.spring.thymeleaf.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.spring.*;
public class Helloworldcontroller {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("Hello, Thymeleaf!");
        return "hello";
    }
}
