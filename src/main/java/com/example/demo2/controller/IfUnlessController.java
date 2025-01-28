package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.Car;

@Controller
@RequestMapping("/if-unless")
public class IfUnlessController {


    @RequestMapping("")
    public String index(Model model){
        Car car =new Car();
        car.setSpeed(60);
        model.addAttribute("car", car);

        return "if-unless";
    }

}
