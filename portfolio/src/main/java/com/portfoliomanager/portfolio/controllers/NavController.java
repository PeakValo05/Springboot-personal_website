package com.portfoliomanager.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NavController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about-page";
    }

    @GetMapping("/connect")
    public String connect() {
        return "connect";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact-page";
    }
}