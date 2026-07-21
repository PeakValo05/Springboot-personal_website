package com.portfoliomanager.portfolio.data;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import com.portfoliomanager.portfolio.models.AnalyticsModel;
import com.portfoliomanager.portfolio.models.EducationModel;

import com.portfoliomanager.portfolio.models.AnalyticsModel;
import com.portfoliomanager.portfolio.models.SkillsModel;



public class EducationDAO {


    // Database connection string
    private final String url = "jdbc:mysql://localhost:8889/personal_website";
    // Database username
    private final String user = "root";
    // Database password
    private final String password = "root";

  



    public List<EducationModel> getAllEducation(){
        List<EducationModel> educationList = new ArrayList<>();


        // Establish a database connection and retrieve skills data
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM education";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            // Iterate through the result set and create EducationModel objects
            while (resultSet.next()) {
                int educationId = resultSet.getInt("EDUCATION_ID");
                String name = resultSet.getString("NAME");
                int startYear = resultSet.getInt("START_YEAR");
                int endYear = resultSet.getInt("END_YEAR");
                String degree = resultSet.getString("DEGREE");
                String city = resultSet.getString("CITY");
                String state = resultSet.getString("STATE");
                BigDecimal percentage = resultSet.getBigDecimal("PERCENTAGE");
                // Create an EducationModel object and add it to the list
                EducationModel education = new EducationModel(educationId, name, startYear, endYear, degree, city, state, percentage);
                educationList.add(education);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return educationList;
    }

    



    
}
