package com.ioc2;

import com.ioc.Foo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class EmpTest {

    ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("config/beans.xml");


    }

    @Test
    public void testInstance() {
        Emp emp = applicationContext.getBean("emp" , Emp.class);
        System.out.println(emp);
    }

}