package com.portfoliomanager.portfolio.data;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

import com.portfoliomanager.portfolio.models.AnalyticsModel;
import com.portfoliomanager.portfolio.models.SkillsModel;



public class AnalyticsDAO {


    // Database connection string
    private final String url = "jdbc:mysql://localhost:8889/personal_website";
    // Database username
    private final String user = "root";
    // Database password
    private final String password = "root";

  



    public List<AnalyticsModel> getAllAnalytics(){
        List<AnalyticsModel> analyticsList = new ArrayList<>();


        // Establish a database connection and retrieve skills data
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM analytics";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            // Iterate through the result set and create SkillsModel objects
            while (resultSet.next()) {
                int analyticsId = resultSet.getInt("ANALYTICS_ID");
                int projectsCompleted = resultSet.getInt("PROJECTS_COMPLETED");
                int repositories = resultSet.getInt("REPOSITORIES");
                int languagesKnown = resultSet.getInt("LANGUAGES_KNOWN");
                int commits = resultSet.getInt("COMMITS");
                int yearsProgramming = resultSet.getInt("YEARS_PROGRAMMING");
                int certifications = resultSet.getInt("CERTIFICATIONS");
                LocalDate lastUpdated = resultSet.getDate("LAST_UPDATED").toLocalDate();
                // Create a SkillsModel object and add it to the list
                AnalyticsModel analytics = new AnalyticsModel(analyticsId, projectsCompleted, repositories, languagesKnown, commits, yearsProgramming, certifications, lastUpdated);
                analyticsList.add(analytics);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return analyticsList;
    }
    



    
}
