package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Link")
public class LinkController {

    @RequestMapping("")
    public String index(){
        return "link";

    }

    @RequestMapping("/page2")
    public String page2() {
        return "page2";
    }

    @RequestMapping("/page3")
    public String page3() {
        return "page3"; 
    }

}
