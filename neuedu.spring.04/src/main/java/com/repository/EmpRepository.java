package com.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpRepository {

    @Autowired  JdbcTemplate jdbcTemplate;

    public int getEmpCount() {
        return jdbcTemplate.queryForObject("select count(*) from emp" , Integer.class);
    }

}
