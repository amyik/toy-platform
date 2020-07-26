package com.albert.securingweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuredController {

    @GetMapping("/private")
    public String privateRoot() {
        return "/private";
    }

    @GetMapping("/public")
    public String publicRoot() {
        return "/public";
    }
}
