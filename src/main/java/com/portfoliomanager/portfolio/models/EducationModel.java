package com.portfoliomanager.portfolio.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EducationModel {



    public EducationModel() {
    }

    private int educationId;
    private String name;
    private int startYear;
    private int endYear;
    private String degree;
    private String city;
    private String state;
    private BigDecimal percentage;


    public EducationModel(int educationId, String name, int startYear, int endYear, String degree, String city, String state, BigDecimal percentage) {


        this.educationId = educationId;
        this.name = name;
        this.startYear = startYear;
        this.endYear = endYear;
        this.degree = degree;
        this.city = city;
        this.state = state;
        this.percentage = percentage;

    }

    public int getEducationId() {
        return educationId;
    }

    public void setEducationId(int educationId) {
        this.educationId = educationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }
}