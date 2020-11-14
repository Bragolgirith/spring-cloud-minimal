package com.example.configclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${user.role}")
    private String role;

    @GetMapping(value = "/test", produces = MediaType.TEXT_PLAIN_VALUE)
    public String whoami() {
        return String.format("Hello! You're %s...\n", role);
    }
}
