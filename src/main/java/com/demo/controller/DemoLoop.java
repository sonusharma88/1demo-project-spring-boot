package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoLoop {

    @RequestMapping("/names")
    public String names() {
        String names = "Radhe";
        for (int i=1;i<10;i++) {

        }

        return names;
    }
}
