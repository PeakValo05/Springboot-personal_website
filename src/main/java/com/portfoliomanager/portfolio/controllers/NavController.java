package com.portfoliomanager.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import com.portfoliomanager.portfolio.data.CinemarkSkillsDataAccessObject;
import com.portfoliomanager.portfolio.data.CostcoSkillsDataAccessObject;



import org.springframework.ui.Model;


@Controller
public class NavController {

    // Handle the root URL ("/") and return the "index" view
    @GetMapping("/")
    public String home(Model model) {

        CostcoSkillsDataAccessObject dao = new CostcoSkillsDataAccessObject();
        model.addAttribute("costcoSkills", dao.getAllSkills());

        CinemarkSkillsDataAccessObject cinemarkDao = new CinemarkSkillsDataAccessObject();
        model.addAttribute("cinemarkSkills", cinemarkDao.getAllSkills());

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