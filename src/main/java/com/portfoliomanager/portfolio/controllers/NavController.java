package com.portfoliomanager.portfolio.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.portfoliomanager.portfolio.data.SkillsDAO;
import com.portfoliomanager.portfolio.models.SkillsModel;

import org.springframework.ui.Model;


@Controller
public class NavController {

    // Objects
    SkillsDAO dao = new SkillsDAO();
    SkillsDAO service = new SkillsDAO();

    // Handle the root URL ("/") and return the "index" view
    @GetMapping("/")
    public String home(Model model) {

        List<SkillsModel> skills = service.getAllSkills();
        model.addAttribute("skills", dao.getAllSkills());

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