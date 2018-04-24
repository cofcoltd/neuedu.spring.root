package com.service;


import com.Repository.EmpRepository;
import com.domain.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmpService {

    @Autowired
    private EmpRepository empRepository;


    //(readOnly = true , isolation = Isolation.READ_COMMITTED)
    public int[] saveEmp(Emp emp) {

        int[] result = empRepository.saveEmp2(emp);

        int a = 1/0;

        return result;

    }

}
