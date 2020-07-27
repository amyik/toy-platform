package com.albert.securingweb.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class SecuredService {

    @Secured("ROLE_USER")
    public String sayHelloSecured(){
        return "Hello Secured";
    }
}
