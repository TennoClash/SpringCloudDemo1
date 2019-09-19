package com.forezp.servicefeign.repositry;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi")
public interface SchedualServiceWelcome {
    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    String welcomeFromC1(@RequestParam(value = "name") String name);
}
