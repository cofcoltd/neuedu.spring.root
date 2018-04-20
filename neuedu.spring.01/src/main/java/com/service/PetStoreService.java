package com.service;

import java.util.Arrays;
import java.util.List;

public class PetStoreService {

    private String petName;
    private int age;
    private String[] strs;
    private List<String> lists;


    public String[] getStrs() {
        return strs;
    }

    public void setStrs(String[] strs) {
        this.strs = strs;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public PetStoreService() {
    }

    public PetStoreService(String petName, int age) {
        this.petName = petName;
        this.age = age;
    }

//    public PetStoreService(String petName) {
//        this.petName = petName;
//    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getNameList() {
        System.out.println("tom   ,   jack  ,  dog  ........");
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PetStoreService{");
        sb.append("petName='").append(petName).append('\'');
        sb.append(", age=").append(age);
        sb.append(", strs=").append(strs == null ? "null" : Arrays.asList(strs).toString());
        sb.append(", lists=").append(lists);
        sb.append('}');
        return sb.toString();
    }
}
