package com.course.polymorphism.domain;

public class Shape {

    private String color;
    double area;


    public Shape(String color) {
        this.color = color;
    }

    void draw(){
        System.out.println("Drawing a shape");
    }

    public Shape getShape(){ // covariant return types
        return this;
    }


    public void calculateArea(){
        area = -1.0;
    }

    public static void staticMethod(){
        System.out.println("Static shape");
    }

}
