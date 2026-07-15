package com.portfoliomanager.portfolio.models;

public class CinemarkSkillsModel {

    public int cinemarkSkillsId;
    public String company;
    public String environment;
    public String focus;




    public CinemarkSkillsModel(int cinemarkSkillsId, String company, String environment, String focus) {
        this.cinemarkSkillsId = cinemarkSkillsId;
        this.company = company;
        this.environment = environment;
        this.focus = focus;
    }

    // Getters and Setters
    public int getCinemarkSkillsId() {
        return cinemarkSkillsId;
    }
    public void setCinemarkSkillsId(int cinemarkSkillsId) {
        this.cinemarkSkillsId = cinemarkSkillsId;
    }

    
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getEnvironment() {
        return environment;
    }
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getFocus() {
        return focus;
    }
    public void setFocus(String focus) {
        this.focus = focus; 
    }


    
}
