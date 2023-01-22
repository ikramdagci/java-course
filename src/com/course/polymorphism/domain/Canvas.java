package com.course.polymorphism.domain;

public class Canvas {
    /*
    public void drawTriangle(Triangle triangle){
        triangle.draw();
    }

    public void drawCircle(Circle circle) {
        circle.draw();
    }

    public void drawRectangle(Rectangle rectangle) {
        rectangle.draw();
    }*/

    public void drawShape(Shape shape) {
        shape.draw(); // polymorphic call
        shape.calculateArea();

        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            double radius = circle.getRadius();
            System.out.println("Radius:"+radius);
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            int x = rectangle.getX();
            int y = rectangle.getY();
            System.out.println(x + "," + y);
        }


    }

}
