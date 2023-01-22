package com.course.polymorphism.domain;

public class Triangle extends Shape {

    private int x;
    private int y;
    private int z;

    public Triangle(String color,int x,int y,int z) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle..");
    }

}
