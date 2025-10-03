package dev.matias.springsecurity.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/login-page")
    public String loginPage() {
        return "forward:/front-end/public/login-form-20/index.html";
    }

    @GetMapping("/home")
    public String userHome() {
        // Qualquer user logado pode acessar
        return "forward:/front-end/user/home.html";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "forward:/front-end/admin/home_admin.html";
    }

    // @GetMapping("/access-denied")
    // public String accessDenied() {
    //     return "forward:/front-end/public/access-denied.html";
    // }
}
