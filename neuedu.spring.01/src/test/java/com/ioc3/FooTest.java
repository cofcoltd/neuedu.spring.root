package com.ioc3;

import com.ioc3.Foo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class FooTest {

    ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("config/beans2.xml");
    }

    @Test
    public void testInstance() {
        Foo foo3 = applicationContext.getBean("foo" , Foo.class);
        foo3.handler();
    }

}