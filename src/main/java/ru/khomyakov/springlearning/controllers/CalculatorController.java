package ru.khomyakov.springlearning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.khomyakov.springlearning.Actions;

@Controller
public class CalculatorController {

    @GetMapping("/first/calculator")
    public String calculator(@RequestParam("first") double a,
                             @RequestParam("second") double b,
                             @RequestParam("action") Actions action,
                             Model model) {
        double result = 0;

        switch (action) {
            case ADDITION:
                result = a + b;
                break;
            case MULTIPLICATION:
                result = a * b;
                break;
            case SUBTRACTION:
                result = a - b;
                break;
            case DIVISION:
                result = a / b;
        }

        model.addAttribute("result", result);

        return "/first/calculator";
    }

}
