package com.Repository;

import com.domain.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class EmpRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public int getEmpCount() {

        return jdbcTemplate.queryForObject("select count(*) from emp" , Integer.class);
    }

    @Transactional    //事物传播机制  / AOP
    public int saveEmp(Emp emp) {

        final String sql = "insert into emp (ename , salary) values ( ? , ? )";

        int row =  jdbcTemplate.update(sql , emp.getEname() , emp.getSalary() );
        int a = 1/0;
        return row;
    }

    @Transactional(readOnly = true)
    public int[] saveEmp2(final Emp emp) {

        final String sql = "insert into emp (ename , salary) values ( ? , ? )";

        KeyHolder keyHolder = new GeneratedKeyHolder();

        int row =  jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {

                PreparedStatement preparedStatement = connection.prepareStatement(sql , PreparedStatement.RETURN_GENERATED_KEYS);
                preparedStatement.setString(1 , emp.getEname());
                preparedStatement.setBigDecimal(2 , emp.getSalary());
                return preparedStatement;
            }
        } , keyHolder );

        int[] result = {row , keyHolder.getKey().intValue() };

        return result;

    }


}
