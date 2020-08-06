package com.xxxx.git02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        System.out.println ("dev.....");
        return "hello Git";
    }
}
