package com.example.demo2.controller;

import com.example.demo2.form.Ex17QuestionnaireForm;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Ex17QuestionnaireController {

    @GetMapping("/form")
    public String showForm(@ModelAttribute("form") Ex17QuestionnaireForm form) { 
        return "ex-17-input";
    }//初期化されたオブジェクトをモデルに追加

    @PostMapping("/submit")
    public String submitForm(
        @ModelAttribute("form") 
        @Valid Ex17QuestionnaireForm form
        ,BindingResult bindingResult 
        ,Model model) {//フォームデータをバリデーション
        

            if (bindingResult.hasErrors()) {
                return "ex-17-input"; // バリデーションエラーがあれば、入力画面に戻る
            }

        //下記が足りてなくて原因で動かなかった！！成功時には結果画面に渡す！
        model.addAttribute("form", form);
        return "ex-17-result";
    }

    private List<String> validateForm(Ex17QuestionnaireForm form) {
        List<String> errors = new ArrayList<>();


        if (!StringUtils.hasText(form.getName())) {
            errors.add("名前は必須項目です。");
        }
        if (!StringUtils.hasText(form.getEmail())) {
            errors.add("メールアドレスは必須項目です。");
        }
        return errors;
    }
}


