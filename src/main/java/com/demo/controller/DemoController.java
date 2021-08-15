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

        @RequestMapping("/Name")
        public List<String> listofNames(){

            ArrayList <String> Name = new ArrayList<>();
            Name.add("Radhe");
            Name.add("Ramesh");
            Name.add("Aradhya");
            Name.add("Ruby");
            Name.add("Madhu");
            Name.add("Ram Sharma");
            return Name;

        }
        // addition
        @RequestMapping("/add")
    public int add(){

        int a=20,b=250;
        int add= a+b;
        return add;


        }
        // subtration
     @RequestMapping("/sub")
    public int sub(){
        int a=67,b=34;
        int sub=a-b;
        return sub;

    }
    // Multipication
    @RequestMapping("/mul")
    public int mul(){
        int a=7,b=65;
        int mul=a*b;
        return mul;

    }
    // divide
    @RequestMapping("/div")
    public int div(){
        int a=50,b=5;
        int div= a/b;
        return div;

    }

}
