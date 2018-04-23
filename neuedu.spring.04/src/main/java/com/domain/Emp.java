package com.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Emp {

    private int eid;
    private String ename;
    private BigDecimal salary;
}
