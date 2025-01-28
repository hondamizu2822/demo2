package com.example.demo2.form;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Ex17QuestionnaireForm {

    @Size(min = 1, max = 127, message = "1桁以上127桁以下で入力してください")
    @NotBlank(message = "名前を入力してください")
    private String name;

    @Size(min = 1, max = 127, message = "Eメールは1文字以上127文字以内で記載してください")
    @Email(message = "Eメールの形式が不正です")
    private String email;

    @NotBlank(message = "性別を選択してください")
    private String gender;

    @NotEmpty(message = "趣味を1つ以上選択してください")
    private List<String> hobbies;

    private String language;

    @Size(min = 1, max = 20000, message = "1桁以上20000桁以内で入力してください")
    private String comments;

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) { // 修正: 引数を追加
        this.hobbies = hobbies;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
