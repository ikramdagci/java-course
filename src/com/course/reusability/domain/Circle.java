package com.course.reusability.domain;

import com.course.constants.MyMath;

public class Circle extends Shape{

    private double r;
    //private String color;
    //private double area;

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
        this.area = MyMath.calculateCircleArea(r);
    }

    public void draw() {
        System.out.println("Drawing Circle");
    }


}
