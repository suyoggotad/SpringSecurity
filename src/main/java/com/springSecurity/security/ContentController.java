package com.springSecurity.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/home")
    public String handlWelcome(){
        return "home";
    }

    @GetMapping("/admin/home")
    public String handleAdminHome(){
        return "home_admin";
    }

    @GetMapping("/user/home")
    public String handleUserHome(){
        return "home_user";
    }

    @GetMapping("/login")
    public String handleLogin(){
        return "custom_login";
    }
}
