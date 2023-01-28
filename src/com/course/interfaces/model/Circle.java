package com.course.interfaces.model;

public class Circle extends Shape {
    public Circle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("o");
    }

    @Override
    public double getArea() {
        return 0;
    }
}
