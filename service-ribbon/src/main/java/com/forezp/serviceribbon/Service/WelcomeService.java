package com.forezp.serviceribbon.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WelcomeService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "welcomError")
    public  String welcomeService(String name){
        return restTemplate.getForObject("http://service-hi/welcome?name="+name,String.class);
    }

    public String welcomError(String name){
        return  "hi,"+name+",sorry,error!";
    }
}
