package com.repository;

import com.config.AppConfig;
import com.config.DbConfig;
import com.domain.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class EmpRepositoryTest {

    @Test
    public void getEmpCount() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class , DbConfig.class);

        EmpRepository empRepository = applicationContext.getBean(EmpRepository.class);
        System.out.println("emp count : " + empRepository.getEmpCount());


        Emp emp = new Emp();

    }
}