package com.course.interfaces;

public class Rectangle implements Colorable,Drawable{

    String color;
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {

    }
}
