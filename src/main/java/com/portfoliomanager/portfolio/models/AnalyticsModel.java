package com.portfoliomanager.portfolio.models;

import java.time.LocalDate;

public class AnalyticsModel {

    private int analyticsId;
    private int projectsCompleted;
    private int repositories;
    private int languagesKnown;
    private int commits;
    private int yearsProgramming;
    private int certifications;
    private LocalDate lastUpdated;

    public AnalyticsModel() {
    }

    public AnalyticsModel(
            int analyticsId,
            int projectsCompleted,
            int repositories,
            int languagesKnown,
            int commits,
            int yearsProgramming,
            int certifications,
            LocalDate lastUpdated
    ) {
        this.analyticsId = analyticsId;
        this.projectsCompleted = projectsCompleted;
        this.repositories = repositories;
        this.languagesKnown = languagesKnown;
        this.commits = commits;
        this.yearsProgramming = yearsProgramming;
        this.certifications = certifications;
        this.lastUpdated = lastUpdated;
    }

    public int getAnalyticsId() {
        return analyticsId;
    }

    public void setAnalyticsId(int analyticsId) {
        this.analyticsId = analyticsId;
    }

    public int getProjectsCompleted() {
        return projectsCompleted;
    }

    public void setProjectsCompleted(int projectsCompleted) {
        this.projectsCompleted = projectsCompleted;
    }

    public int getRepositories() {
        return repositories;
    }

    public void setRepositories(int repositories) {
        this.repositories = repositories;
    }

    public int getLanguagesKnown() {
        return languagesKnown;
    }

    public void setLanguagesKnown(int languagesKnown) {
        this.languagesKnown = languagesKnown;
    }

    public int getCommits() {
        return commits;
    }

    public void setCommits(int commits) {
        this.commits = commits;
    }

    public int getYearsProgramming() {
        return yearsProgramming;
    }

    public void setYearsProgramming(int yearsProgramming) {
        this.yearsProgramming = yearsProgramming;
    }

    public int getCertifications() {
        return certifications;
    }

    public void setCertifications(int certifications) {
        this.certifications = certifications;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}