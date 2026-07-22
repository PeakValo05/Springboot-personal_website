package com.portfoliomanager.portfolio.models;

import java.math.BigDecimal;

public class SkillsModel {

    private int skillsId;
    private String name;
    private BigDecimal percentage;
    private String skillsImage;




    public SkillsModel(int skillsId, String name, BigDecimal percentage, String skillsImage) {
        this.skillsId = skillsId;
        this.name = name;
        this.percentage = percentage;
        this.skillsImage = skillsImage;
    }

    // Getters and Setters
    public int getSkillsId() {
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

    public String getSkillsImage() {
        return skillsImage;
    }
    public void setSkillsImage(String skillsImage) {
        this.skillsImage = skillsImage; 
    }


    
}
