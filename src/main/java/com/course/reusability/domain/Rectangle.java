package com.course.reusability.domain;

// Rectangle IS-A shape
public class Rectangle extends Shape{


    //private String color;
    //private double area;
    private double x;
    private double y;

    public Rectangle(String color, double x, double y) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.area = this.x * this.y;
    }

    public void draw(){
        System.out.println("Drawing Rectangle");
    }

}
