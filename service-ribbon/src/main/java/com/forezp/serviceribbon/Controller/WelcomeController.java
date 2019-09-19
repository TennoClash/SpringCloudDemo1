package com.forezp.serviceribbon.Controller;

import com.forezp.serviceribbon.Service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Autowired
    WelcomeService welcomeService;

    @GetMapping(value = "/welcome")
    public  String welcome2 (@RequestParam (value = "name",defaultValue = "hmp",required=false)String name){
        return welcomeService.welcomeService(name);
    }
}
