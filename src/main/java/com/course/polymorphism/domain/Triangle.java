package com.course.polymorphism.domain;

import com.course.reusability.domain.people.Student;

public class Triangle extends Shape {

    private int x;
    private int y;
    private int z;

    public Triangle(String color, int x, int y, int z) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void draw() {
        System.out.println("/\\");
    }

    @Override
    public Triangle getShape() { // covariant
        return this;
    }

    @Override
    public void calculateArea() {
        double u = (x + y + z) / 2.0;
        super.area = Math.sqrt(u * (u - x) * (u - y) * (u - z));
    }

}
