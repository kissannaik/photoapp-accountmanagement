package com.kissan.photoappaccountmanagement.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private Environment env;

    @GetMapping("/status")
    public String getStatus(){
        return "AccountMgmt Working on port "+env.getProperty("local.server.port");
    }
}
