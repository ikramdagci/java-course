package com.course.constants.obj;

public class Person {

    private String fullName;
    private final String tckn;

    public Person(String fullName,String tckn){
        this.tckn = tckn;
        this.fullName = fullName;
    }

    /*
    ILLEGAL!
    public void setTckn(String newTckn) {
        tckn = newTckn;
    }
    */



}
