package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoArrayList {

@RequestMapping("/name")
    public List<String> ListOfNames() {
    ArrayList<String> name = new ArrayList<>();
    name.add("Kishan");
    name.add("Sonu");
    name.add("Ram");
    name.add("Aradhya");
    name.add("Ruby");
    name.add("Mukesh");
    return name;

}

}
