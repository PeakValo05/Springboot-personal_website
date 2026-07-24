package com.portfoliomanager.portfolio.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.portfoliomanager.portfolio.data.AnalyticsDAO;
import com.portfoliomanager.portfolio.data.SkillsDAO;
import com.portfoliomanager.portfolio.models.AnalyticsModel;
import com.portfoliomanager.portfolio.models.SkillsModel;
import com.portfoliomanager.portfolio.data.EducationDAO;            
import com.portfoliomanager.portfolio.models.EducationModel;

import org.springframework.ui.Model;


@Controller
public class NavController {

    // Objects
    private final SkillsDAO skillsDAO = new SkillsDAO();
    private final AnalyticsDAO analyticsDAO = new AnalyticsDAO();
    private final EducationDAO educationDAO = new EducationDAO();
    




    // Handle the root URL ("/") and return the "index" view
@GetMapping("/")
public String home(Model model) {

    List<SkillsModel> skills = skillsDAO.getAllSkills();
    model.addAttribute("skills", skills);

    List<AnalyticsModel> analytics = analyticsDAO.getAllAnalytics();
    model.addAttribute("analytics", analytics);

    List<EducationModel> educationList = educationDAO.getAllEducation();
    model.addAttribute("educationList", educationList);

    return "index";
    }
}