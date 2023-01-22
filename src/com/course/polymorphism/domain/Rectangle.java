package com.course.polymorphism.domain;

public class Rectangle extends Shape{

    private int x;
    private int y;

    public Rectangle(String color,int x,int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle..");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
