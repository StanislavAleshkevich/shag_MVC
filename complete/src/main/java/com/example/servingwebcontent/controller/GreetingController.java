package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.DTO.TestModelDTO;
import com.example.servingwebcontent.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class GreetingController {

    @Autowired
    private CalcService calcService;

    @GetMapping("/greeting")
    public String greeting(@RequestBody TestModelDTO testModel,
                           Model model) {
        model.addAttribute("sum", calcService.calc(testModel));
        return "greeting";
    }

}
