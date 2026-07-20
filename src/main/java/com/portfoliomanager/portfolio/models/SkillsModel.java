package com.portfoliomanager.portfolio.models;

import java.math.BigDecimal;

public class SkillsModel {

    public int skillsId;
    public String name;
    public BigDecimal percentage;
    public String skillsImage;




    public SkillsModel(int skillsId, String name, BigDecimal percentage, String skillsImage) {
        this.skillsId = skillsId;
        this.name = name;
        this.percentage = percentage;
        this.skillsImage = skillsImage;
    }

    // Getters and Setters
    public int skillsId() {
        return skillsId;
    }
    public void setSkillsId(int skillsId) {
        this.skillsId = skillsId;
    }

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }
    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public String getskillsImage() {
        return skillsImage;
    }
    public void setFocus(String skillsImage) {
        this.skillsImage = skillsImage; 
    }


    
}
