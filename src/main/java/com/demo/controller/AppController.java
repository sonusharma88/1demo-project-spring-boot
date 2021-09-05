package com.demo.controller;

import com.demo.service.AppService;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
     @Autowired
     AppService appService;

    @RequestMapping(value = "/app_demo",method = RequestMethod.GET )
    public String message(){

        // AppService obj = new AppService();


        return appService.serviceMethod();
    }
}
