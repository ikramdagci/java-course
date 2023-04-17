package com.course.inner.anonymous;

import com.course.inner.example.Iterator;
import com.course.polymorphism.domain.Ellipse;
import com.course.polymorphism.domain.Shape;
import com.course.polymorphism.domain.Triangle;

public class Driver {

    public static void main(String[] args) {

        Shape shape = new Shape("Black") {
            @Override
            public void draw() {

            }

            @Override
            public void calculateArea() {

            }

            @Override
            public Shape getShape(){
                return null;
            }
        };
        //equals
        Shape shape1 = new DriverAbstractClasses$1("Black");

        Iterator iterator = new Iterator() {
            @Override
            public boolean end() {
                return false;
            }

            @Override
            public Object current() {
                return null;
            }

            @Override
            public void next() {

            }
        };

        System.out.println(shape.getClass().getName());

    }

}
