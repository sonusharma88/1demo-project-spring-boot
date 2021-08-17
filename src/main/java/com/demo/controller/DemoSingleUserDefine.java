package com.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoSingleUserDefine {

    @RequestMapping("/scanner/{hello}")
    public String scanner(@PathVariable String hello){
          return "WELCOME " + hello;

    }
}
