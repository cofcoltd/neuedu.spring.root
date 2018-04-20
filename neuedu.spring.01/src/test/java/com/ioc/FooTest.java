package com.ioc;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class FooTest {

    ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("config/beans.xml");


    }

    @Test
    public void testInstance() {
        Foo foo = applicationContext.getBean("foo" , Foo.class);
    }

}