package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@EnableAutoConfiguration
@RestController
@RequestMapping("admin/")
public class DemoApplication {

    @RequestMapping("home")
    String home(HttpServletRequest request){
        String uname = "Ed";
        int count = 100;
        return "这是"+uname+"的第"+count+"次访问";

    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
