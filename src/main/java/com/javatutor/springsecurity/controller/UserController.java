package com.javatutor.springsecurity.controller;


import com.javatutor.springsecurity.model.UserModel;
import com.javatutor.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String loginPage() {
        return "login";
    }

    @PostMapping
    public void loginProcess(@ModelAttribute UserModel userModel) {
        userService.loadUserByUsername(userModel.getUsername());
    }

}
