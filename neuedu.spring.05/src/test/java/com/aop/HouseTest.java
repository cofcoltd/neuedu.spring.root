package com.aop;

import com.aop.Aspect.Agent;
import com.config.AppConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class HouseTest {

    ApplicationContext applicationContext ;

    @Before
    public void init() {
        applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    public void buy() {

        House house = applicationContext.getBean(House.class);

//        house.buy();

        house.aaaa();
    }
}