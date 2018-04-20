package com.lifecycle;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Life {  // implements InitializingBean

//
//    private int age;
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        System.out.println("spring 注入了  age ");
//        this.age = age;
//    }
//
//    public void afterPropertiesSet() throws Exception {
//
//        System.out.println("属性 setter 完毕 ");
//    }
//
//    public Life() {
//        System.out.println("构造函数");
//    }
//
//    public void init() {
//        System.out.println("init()");
//    }
//
    public void method() {
        System.out.println("method()");
    }
//
//
//    public void destory(){
//        System.out.println("destory()");
//    }

    @PreDestroy
    public void  destory() {
        System.out.println("@PreDestroy");
    }

    @PostConstruct
    public void  init() {
        System.out.println("@PostConstruct");
    }


}
