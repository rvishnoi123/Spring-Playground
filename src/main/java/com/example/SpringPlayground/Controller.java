package com.example.SpringPlayground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Controller {

    @GetMapping("/bar")
    public String helloWorld() {
        return "3.14";
    }
    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }
}
