package com.course.polymorphism.domain.fields;

public class B extends A {

    int value = 2;

    @Override
    public void method() {
        System.out.println("B method");
    }

    @Override
    public int getValue() {
        return value;
    }

    public void somethingBSpecial(){
        System.out.println("B Special method");
    }
}
