package com.forezp.servicefeign.controller;

import com.forezp.servicefeign.repositry.SchedualServiceWelcome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Autowired
    SchedualServiceWelcome schedualServiceWelcome;

    @GetMapping(value = "/welcome")
    public String sayHi(@RequestParam String name) {
        return schedualServiceWelcome.welcomeFromC1(name);
    }
}
