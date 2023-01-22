package com.course.polymorphism.domain;

public class Circle extends Shape {

    private double radius;

    public Circle(String color,double radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }

    @Override
    public Circle getShape() {
        return this;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }


    @Override
    public String toString() {
        return "Circle; radius=" + this.radius;
    }

    public static void staticMethod(){
        System.out.println("Static circle");
    }
}
