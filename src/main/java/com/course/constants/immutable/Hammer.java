package com.course.constants.immutable;

import com.course.polymorphism.domain.Circle;

public final class Hammer {

    private final double weight;
    private final double length;

    public Hammer(double weight, double length) {
        this.weight = weight;
        this.length = length;
    }

    public void hit(){
        System.out.println("Hitting...");
    }

    public void hitCircle(final Circle circle) {
        //circle = new Circle("Red",3.0); error
        circle.setRadius(3.0);
        System.out.println("Hitting to circle with radius " + circle.getRadius());
    }



}
