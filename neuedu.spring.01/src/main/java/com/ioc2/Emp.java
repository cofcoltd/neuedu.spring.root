package com.ioc2;

import java.util.List;

public class Emp {

    private String name;
    private int id;
    private List<String> skills;

    public Emp(String name, int id, List<String> skills) {
        this.name = name;
        this.id = id;
        this.skills = skills;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Emp{");
        sb.append("name='").append(name).append('\'');
        sb.append(", id=").append(id);
        sb.append(", skills=").append(skills);
        sb.append('}');
        return sb.toString();
    }
}
