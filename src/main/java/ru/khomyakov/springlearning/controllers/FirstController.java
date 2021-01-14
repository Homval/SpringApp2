package ru.khomyakov.springlearning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String onPageHello(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname", required = false) String surname) {

        System.out.println("Hello " + name + " " + surname);
        return "/first/hello";
    }

    @GetMapping("/goodbye")
    public String onPageGoodbye() {
        return "/first/goodbye";
    }
}
