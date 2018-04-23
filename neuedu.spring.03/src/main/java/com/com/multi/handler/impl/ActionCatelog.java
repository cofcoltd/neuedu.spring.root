package com.com.multi.handler.impl;

import com.com.multi.handler.MovieCatelog;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("action")
public class ActionCatelog implements MovieCatelog {

    public void find() {
        System.out.println("find action movie");
    }
}
