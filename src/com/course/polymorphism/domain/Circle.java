package com.course.polymorphism.domain;

import com.course.abstraction.util.AreaUtil;

public class Circle extends Shape {

    private double radius;

    public Circle(String color,double radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public void draw() {
        int radius = (int)this.radius;
        for (int y = -radius; y <= radius; y++) {
            for (int x = -radius; x <= radius; x++) {
                if (x * x + y * y <= radius * radius) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public void calculateArea() {
        super.area = AreaUtil.calculateCircleArea(radius);
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
