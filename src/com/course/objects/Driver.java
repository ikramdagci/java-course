package com.course.objects;

import com.course.polymorphism.domain.Circle;
import com.course.polymorphism.domain.Shape;


public class Driver {

    public static void main(String[] args) {

        Circle circle = new Circle("Black",1.0);
        String toString = circle.toString();
        System.out.println(toString);
        int i = circle.hashCode();
        System.out.println(i);

        System.out.println(circle);

        Circle circle1 = new Circle("Red",1.0);

        circle1.staticMethod();

        Circle.staticMethod();
        Shape.staticMethod();





    }

}
