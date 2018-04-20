package com.service;

import com.domain.Emp;
import config.AppConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class EmpServiceTest {

    @Test
    public void addEmp() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        EmpService empService = applicationContext.getBean(EmpService.class);

        empService.addEmp(new Emp());
    }
}