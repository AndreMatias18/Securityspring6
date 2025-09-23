package dev.matias.springsecurity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PageController {
    @GetMapping("/login-page")
    public String loginPage() {
        
        return "forward:/front-end/html/login/login.html";
    }
}
