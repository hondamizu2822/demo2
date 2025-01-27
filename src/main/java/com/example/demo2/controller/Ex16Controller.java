package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo2.domain.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Ex16Controller {
    @GetMapping("/")
    public String index(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        List<User> chatList = (List<User>) session.getAttribute("chatList");

        if (chatList == null) {
            chatList = new ArrayList<>();
            session.setAttribute("chatList", chatList);
        }

        model.addAttribute("chatList", chatList);
        return "ex-16";
    }

    @PostMapping("/post")
    public String post(@RequestParam String name, @RequestParam String comment, HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<User> chatList = (List<User>) session.getAttribute("chatList");

        if (chatList == null) {
            chatList = new ArrayList<>();
            session.setAttribute("chatList", chatList);
        }

        // 新しい投稿をリストの先頭に追加
        chatList.add(0, new User(name, comment));

        // **追加課題対応**: PRGパターンを適用 (リロード時の二重投稿防止)
        return "redirect:/";
    }

}
