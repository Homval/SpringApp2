package ru.khomyakov.springlearning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String onPageHello() {
        return "/first/hello";
    }

    @GetMapping("/goodbye")
    public String onPageGoodbye() {
        return "/first/goodbye";
    }
}
