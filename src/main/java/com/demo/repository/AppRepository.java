package com.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AppRepository {

    public String repoMethod(){

        return "response from repository";
    }


}
