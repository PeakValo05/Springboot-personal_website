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

import com.portfoliomanager.portfolio.models.SkillsModel;



public class SkillsDAO {


    // Database connection string
    private final String url = "jdbc:mysql://localhost:8889/personal_website";
    // Database username
    private final String user = "root";
    // Database password
    private final String password = "root";

  



    public List<SkillsModel> getAllSkills(){
        List<SkillsModel> skillsList = new ArrayList<>();


        // Establish a database connection and retrieve skills data
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM skills";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            // Iterate through the result set and create SkillsModel objects
            while (resultSet.next()) {
                int skillsId = resultSet.getInt("SKILLS_ID");
                String name = resultSet.getString("NAME");
                BigDecimal percentage = resultSet.getBigDecimal("PERCENTAGE");
                String skillsImage = resultSet.getString("SKILL_IMAGE");
                // Create a SkillsModel object and add it to the list
                SkillsModel skill = new SkillsModel(skillsId, name, percentage, skillsImage);
                skillsList.add(skill);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return skillsList;
    }
    



    
}
