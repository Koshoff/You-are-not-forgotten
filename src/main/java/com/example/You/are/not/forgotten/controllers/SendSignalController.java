package com.example.You.are.not.forgotten.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/send-signal")
public class SendSignalController {

    @GetMapping
    public ModelAndView modelAndView() {
        return new ModelAndView("send-signal");
    }
}
