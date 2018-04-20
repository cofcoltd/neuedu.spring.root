package com.service;

import com.domain.Emp;
import com.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component
@Service
public class EmpService {

//    @Resource
    @Autowired
    private EmpRepository empRepository;    //根据类别自动装配     @Autowired 是 spring 标准   , @Resource 是 javaEE 推荐的使用标准

    public void addEmp(Emp emp) {
        empRepository.saveEmp(emp);
    }
}
