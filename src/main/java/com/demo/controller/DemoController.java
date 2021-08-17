package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController

public class DemoController {

    @RequestMapping("/welcome")

    public void hello(){

        System.out.println("hello, welcome spring boot ..");
    }



        @RequestMapping("/welcome_demo")
        public String demo_hello(){
        return "Kishan pal singh ..welcome ";
        }


}
