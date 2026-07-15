package com.portfoliomanager.portfolio.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.portfoliomanager.portfolio.models.CostcoSkillsModel;



public class CostcoSkillsDataAccessObject {


    // Database connection details
    private final String url = "jdbc:mysql://localhost:8889/personal_website";
    private final String user = "root";
    private final String password = "root";





    public List<CostcoSkillsModel> getAllSkills(){
        List<CostcoSkillsModel> skillsList = new ArrayList<>();


        // Establish a database connection and retrieve skills data
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM costco_skills";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            // Iterate through the result set and create SkillsModel objects
            while (resultSet.next()) {
                int costcoSkillsId = resultSet.getInt("COSTCO_SKILLS_ID");
                String company = resultSet.getString("COMPANY");
                String environment = resultSet.getString("ENVIRONMENT");
                String focus = resultSet.getString("FOCUS");
                // Create a SkillsModel object and add it to the list
                CostcoSkillsModel skill = new CostcoSkillsModel(costcoSkillsId, company, environment, focus);
                skillsList.add(skill);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return skillsList;
    }
    



    
}
