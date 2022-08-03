package com.utosoftware.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.utosoftware.app.filters.LambdaFilter.string;

@RestController
public class HomeController {
    @GetMapping("/")
    public String now(){
        System.out.println(string(0));
        return new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
    }
}
