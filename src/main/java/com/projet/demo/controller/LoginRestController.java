package com.projet.demo.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.demo.model.Login;
import com.projet.demo.service.LoginService;

import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("login")
public class LoginRestController {
    private LoginService loginService;
    public LoginRestController(LoginService loginService){
       this.loginService=loginService;
    }
@GetMapping("/auth/{email}")
@Operation(summary = "Authentification",description = "Gestion des logins")
Optional<Login>authentifier(@PathVariable String email){
    return  loginService.recherche(email);
}
}
