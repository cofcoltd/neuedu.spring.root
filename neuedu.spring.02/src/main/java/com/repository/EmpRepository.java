package com.repository;

import com.domain.Emp;

import org.springframework.stereotype.Repository;

//@Component
@Repository
public class EmpRepository {

    public void saveEmp(Emp emp) {
        System.out.println("保存员工~~~~~");
    }

}
