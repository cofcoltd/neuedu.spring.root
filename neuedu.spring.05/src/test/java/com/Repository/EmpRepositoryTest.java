package com.Repository;

import com.config.AppConfig;
import com.domain.Emp;
import com.service.EmpService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.Assert.*;

public class EmpRepositoryTest {

    ApplicationContext applicationContext ;

    @Before
    public void init() {
        applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    public void saveEmp() {

        EmpRepository repository = applicationContext.getBean(EmpRepository.class);

        Emp emp = new Emp();
        emp.setEname("tomcat");
        emp.setSalary(new BigDecimal(7000));

       int rows =  repository.saveEmp(emp);

        System.out.println("rows : " + rows );

    }



    @Test
    public void saveEmp2() {

        EmpService empService = applicationContext.getBean(EmpService.class);

        Emp emp = new Emp();
        emp.setEname("tomcat");
        emp.setSalary(new BigDecimal(7000));

        int[] result = empService.saveEmp(emp);

        System.out.println("rows : " + Arrays.toString(result) );

    }
}