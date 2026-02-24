package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World from Aswanth!";
    }

    @Controll
    @RequestMapping("/welcome")
    public class WelcomeController {

        @GetMapping
        public String welcome(Model model) {
            return "forward:/welcome.html";
        }
    }
}