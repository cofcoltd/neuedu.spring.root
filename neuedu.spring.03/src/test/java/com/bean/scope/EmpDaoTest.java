package com.bean.scope;

import com.config.AppConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class EmpDaoTest {

    @Test
    public void testScope() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        EmpDao dao1 = applicationContext.getBean(EmpDao.class);
        EmpDao dao2 = applicationContext.getBean(EmpDao.class);

        System.out.println(dao1 == dao2);


    }

}