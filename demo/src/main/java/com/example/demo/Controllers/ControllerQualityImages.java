package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerQualityImages {

    @GetMapping("/cositas")
    public String helloWorld(String helloworld){
        return "HelloWorld";
    }
}
