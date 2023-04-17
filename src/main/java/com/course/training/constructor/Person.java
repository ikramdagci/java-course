package com.course.training.constructor;

public class Person {

    String fullName;
    int age;

    static {
        System.out.println("Static block! Hi!");
    }

    public Person(){
        this(-1);
    }

    public Person(int age){
        this("UNKNOWN NAME",age);
    }

    public Person(String fullName){
        this(fullName,-1);
    }

    public Person(String fullName,int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Person [ Name:" + this.fullName + ", Age:" + this.age + " ]");
    }



}
