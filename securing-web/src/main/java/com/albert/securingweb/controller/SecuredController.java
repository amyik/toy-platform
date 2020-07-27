package com.albert.securingweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuredController {


    @GetMapping("/")
    public String rootWelcome() {
        return "<h1> WELCOME </H1>";
    }

    @GetMapping("/private")
    public String privateRoot() {
        return "/private";
    }
    @GetMapping("/private/hello")
    public String privateHello() {
        return "<h1>/private/hello</h1>";
    }

    @GetMapping("/public")
    public String publicRoot() {
        return "/public";
    }


    @GetMapping("/role/user")
    public String roleUser() {
        return "hello role user";
    }


    @GetMapping("/role/admin")
    public String roleAdmin() {
        return "hello role admin";
    }
}
