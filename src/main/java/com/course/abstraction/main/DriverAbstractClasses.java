package com.course.abstraction.main;

import com.course.inner.anonymous.DriverAbstractClasses$1;
import com.course.inner.example.Iterator;
import com.course.polymorphism.domain.Ellipse;
import com.course.polymorphism.domain.Shape;
import com.course.polymorphism.domain.Triangle;

public class DriverAbstractClasses {
    public static void main(String[] args) {
        Shape ellipse = new Ellipse("Black",2,3);
        ellipse.draw();

        Shape triangle = new Triangle("Black",2,2,2);
        triangle.draw();

        System.out.println(triangle.getClass().getName());
    }

}
