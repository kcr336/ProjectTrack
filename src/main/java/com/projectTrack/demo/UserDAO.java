package com.projectTrack.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User>getAll(){
        return jdbcTemplate.query("select * from my_states.userdatabase", new User mapRow());
    }
}
