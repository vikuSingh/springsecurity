package com.javatutor.springsecurity.controller;

import com.javatutor.springsecurity.dto.UserDto;
import com.javatutor.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String registerPage() {
        return "register";
    }

    @PostMapping
    public String registerUser(@ModelAttribute UserDto userDto) {
        userService.saveUser(userDto);
        return "/login";
    }
}
