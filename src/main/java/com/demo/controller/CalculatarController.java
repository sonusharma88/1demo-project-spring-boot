package com.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatarController {


    // ************** Calculatar With @PathVariable Using


// addition
    @RequestMapping("/add/{a}/{b}")
    public int add(@PathVariable int a, @PathVariable int b){
        int sum=a+b;
        return sum;
    }

    // subtration
    @RequestMapping("/sub/{a}/{b}")
    public int sub(@PathVariable int a,@PathVariable int b){
        int c= a-b;
        return c;
    }
    // Division
    @RequestMapping("/div/{a}/{b}")
    public int div(@PathVariable int a,@PathVariable int b){
        int division = a/b;
        return division;
    }
    @RequestMapping("/mul/{a}/{b}")
    public int mul(@PathVariable int a, @PathVariable int b){
        int mul = a*b;
        return mul;
    }

    // ************* Calculatar With @RequestParam

    // addition
    @RequestMapping("/addition")
    public int addRequestParam(@RequestParam int a, @RequestParam int b){
        int sum=a+b;
        return sum;
    }

    // subtration
    @RequestMapping("/subtration")
    public int subRequestParam(@RequestParam int a,@RequestParam int b){
        int c= a-b;
        return c;
    }
    // Division
    @RequestMapping("/division")
    public int divRequestParam(@RequestParam int a,@RequestParam int b){
        int division = a/b;
        return division;
    }
    @RequestMapping("/multi")
    public int mulRequestParam(@RequestParam int a, @RequestParam int b){
        int mul = a*b;
        return mul;
    }

    //************ single parameter using @PathVariable

@RequestMapping("/name/{msg}")
    public String name(@PathVariable String msg){

        return "WELCOME " +msg;
    }

}

