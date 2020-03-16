package com.liqpaydemo.liqpaytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LiqpaytestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiqpaytestApplication.class, args);


}

    @GetMapping("/")
    public String liqpaytest() {

        return "hello";
    }
}