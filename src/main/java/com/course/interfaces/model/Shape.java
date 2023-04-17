package com.course.interfaces.model;

import com.course.interfaces.Colorable;
import com.course.interfaces.Drawable;

public abstract class Shape implements Drawable, Colorable {

    private String color;
    double area;


    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
