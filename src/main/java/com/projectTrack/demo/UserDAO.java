package com.projectTrack.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

   public List<User> getAll(){
        return jdbcTemplate.query("select * from my_states.userdatabase",
                new UserDataBaseRowMapper());
    }

    public void addUser (User user){
       jdbcTemplate.update("INSERT INTO my_states.userdatabase(ID, USERNAME, FULL_NAME, EMAIL) VALUES (?,?,?,?)",
             user.getId(), user.getUserName(), user.getFullName(), user.getEmail());
    }

    public void updateUserTable (int ID, User user){
       jdbcTemplate.update("UPDATE my_states.userdatabase SET ID=?, USERNAME=?, FULL_NAME=?, EMAIL=?",
               user.getId(), user.getUserName(),user.getFullName(), user.getEmail());
    }
}
