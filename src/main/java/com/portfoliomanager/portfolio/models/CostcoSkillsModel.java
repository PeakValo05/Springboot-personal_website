package com.portfoliomanager.portfolio.models;

public class CostcoSkillsModel {

    public int costcoSkillsId;
    public String company;
    public String environment;
    public String focus;



    // Constructor
    public CostcoSkillsModel(int costcoSkillsId, String company, String environment, String focus) {
        this.costcoSkillsId = costcoSkillsId;
        this.company = company;
        this.environment = environment;
        this.focus = focus;
    }

    // Getters and Setters
    public int getCostcoSkillsId() {
        return costcoSkillsId;
    }
    public void setCostcoSkillsId(int costcoSkillsId) {
        this.costcoSkillsId = costcoSkillsId;
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
