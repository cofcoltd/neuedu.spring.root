package com.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class PetStoreServiceTest {

    @Test
    public void getNameList() {

        //实例化容器
        ApplicationContext app = new ClassPathXmlApplicationContext("config/beans.xml");

        //use : 从容其中获取 bean 实例

        PetStoreService petStoreService =  app.getBean("petStore" , PetStoreService.class);

        petStoreService.getNameList();


    }
}