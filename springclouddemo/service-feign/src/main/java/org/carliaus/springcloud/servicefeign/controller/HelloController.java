package org.carliaus.springcloud.servicefeign.controller;

import org.carliaus.springcloud.servicefeign.iface.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
