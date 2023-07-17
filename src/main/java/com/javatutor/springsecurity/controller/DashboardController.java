package com.javatutor.springsecurity.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashboard(Authentication authentication, Model model) {
        System.out.println(authentication.getName() + "controller");
        model.addAttribute("username", authentication.getName());
        return "dashboard";
    }
}
