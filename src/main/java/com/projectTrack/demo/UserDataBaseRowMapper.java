package com.projectTrack.demo;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDataBaseRowMapper {

    public User mapRow (ResultSet resultSet) throws SQLException {
        int id;
        String userName;
        String fullName;
        String email;

        id.resultSet.getInt("ID");
        userName.resultSet.getString("USERNAME");
        fullName.resultSet.getString("FULL_NAME");
        email.resultSet.getString("EMAIL");

        return new User (userName,email,fullName);

    }
}
