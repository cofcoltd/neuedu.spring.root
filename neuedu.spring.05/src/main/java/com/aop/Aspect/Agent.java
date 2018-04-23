package com.aop.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Aspect
public class Agent {   //切面类

    //切入点地址 , 说明 要 植入 哪些类中的哪些方法
    @Pointcut("execution(* com.aop.*.*(..))")
    public void pointCut() { }

    //切面代码 会在 指定的时机发生时   并按照切入点  进行植入
    @Before(value ="pointCut()" )
    public  void loan() {
        System.out.println("申请贷款..........");
    }

    @After(value = "pointCut()" )
    public   void transfer() {
        System.out.println("过户................");
    }

}
