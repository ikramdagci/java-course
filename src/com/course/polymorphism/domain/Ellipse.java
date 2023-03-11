package com.course.polymorphism.domain;

import com.course.abstraction.util.AreaUtil;

public class Ellipse extends Shape {

    int a;
    int b;
    public Ellipse(String color, int a, int b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("()");
    }

    @Override
    public Ellipse getShape() {
        return this;
    }

    @Override
    public void calculateArea() {
        super.area = AreaUtil.calculateEllipseArea(a,b);
    }

    @Override
    public String toString() {
        return "Ellipse";
    }
}
