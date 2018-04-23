package com.com.multi.service;


import com.com.multi.handler.MovieCatelog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {

    @Autowired
    @Qualifier("comedy")
    private MovieCatelog movieCatelog;

    public void handler(){
        movieCatelog.find();
    }


}
