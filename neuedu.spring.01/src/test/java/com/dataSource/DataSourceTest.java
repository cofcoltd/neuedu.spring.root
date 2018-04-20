package com.dataSource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;

public class DataSourceTest {
    ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("config/db.xml");


    }

    @Test
    public void testGetConnection() throws Exception{
        DataSource dataSource = applicationContext.getBean("dataSource" , DataSource.class);
        Connection connection = dataSource.getConnection();

        ResultSet rs = connection.prepareStatement("select sysdate()").executeQuery();

        if(rs.next()) System.out.println(rs.getObject(1));

    }

}
