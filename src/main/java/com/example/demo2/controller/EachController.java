package com.example.demo2.controller;

import java.util.ArrayList;  // ArrayListをインポート
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/each")
public class EachController {

    @RequestMapping("")
    public String index(Model model) {
        List<String> itemList = new ArrayList<>();  // ArrayListを正しく使う

        itemList.add("えんぴつ");
        itemList.add("消しゴム");
        itemList.add("ホチキス");

        model.addAttribute("itemList", itemList);  // itemListをModelに渡す

        return "each";  // each.htmlを返す
    }
}

