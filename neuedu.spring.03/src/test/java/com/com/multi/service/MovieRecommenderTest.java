package com.com.multi.service;

import com.config.AppConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class MovieRecommenderTest {

    @Test
    public void handler() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MovieRecommender movieRecommender = applicationContext.getBean(MovieRecommender.class);

        movieRecommender.handler();
    }
}