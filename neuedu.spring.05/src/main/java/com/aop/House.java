package com.aop;


import org.springframework.stereotype.Component;

@Component
public class House {

    public void buy(String name) {

        System.out.println(name+ " 买了一个大房子 ........    ");
    }

}
