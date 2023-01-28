package com.course.polymorphism.domain;

public class Oval extends Shape {

    int a;
    int b;
    public Oval(String color,int a,int b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("()");
    }

    @Override
    public void calculateArea() {

    }
}
