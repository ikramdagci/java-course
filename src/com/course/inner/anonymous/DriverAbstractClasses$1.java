package com.course.inner.anonymous;

import com.course.polymorphism.domain.Shape;

public class DriverAbstractClasses$1 extends Shape {
    public DriverAbstractClasses$1(String color) {
        super(color);
    }

    public void draw() {
    }

    @Override
    public Shape getShape() {
        return this;
    }

    public void calculateArea() {
    }
}