package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class HelloController {

    @GetMapping("hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello World from Aswanth!");
        return "hello";   
    }

    @GetMapping("welcome")
    public String welcome(Model model) {
        return "forward:/welcome.html";
    }
}