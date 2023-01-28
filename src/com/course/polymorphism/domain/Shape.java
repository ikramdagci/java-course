package com.course.polymorphism.domain;

public abstract class Shape {

    private String color;
    double area;


    public Shape(String color) {
        this.color = color;
    }

    public abstract void draw();

    public Shape getShape(){ // covariant return types
        return this;
    }


    public abstract void calculateArea();

    public static void staticMethod(){
        System.out.println("Static shape");
    }

    public double getArea() {
        return area;
    }

}
