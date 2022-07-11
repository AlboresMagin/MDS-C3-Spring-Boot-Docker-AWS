package com.example.mdsc3;

import jdk.jfr.Enabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Mdsc3Application {

    @RequestMapping("/")
    String home(){
        return "Mantenimiento de Software: Proyecto: Spring Boot + Docker + AWS | CodePipeline";
    }

    public static void main(String[] args) {

        SpringApplication.run(Mdsc3Application.class, args);
    }

}
