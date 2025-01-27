package com.example.demo2.controller;

import com.example.demo2.domain.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemController {

    @GetMapping("")
    public String index(Model model) {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("鉛筆", 120, "緑"));
        itemList.add(new Item("消しゴム", 1200, "白"));
        itemList.add(new Item("ノート", 100, "青"));

        model.addAttribute("itemList", itemList);
        return "itemlist"; // HTMLファイル名
    }
}
