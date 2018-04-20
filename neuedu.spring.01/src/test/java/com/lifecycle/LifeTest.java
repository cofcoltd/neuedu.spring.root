package com.lifecycle;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class LifeTest {

    ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("config/life.xml");


    }

    @Test
    public void tedtLife() {
        Life life = applicationContext.getBean("life" , Life.class);
        life.method();

//        applicationContext.registerShutdownHook();
    }

}