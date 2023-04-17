package com.course.polymorphism.main;

import com.course.polymorphism.domain.*;
import com.course.reusability.domain.hr.model.*;

import java.util.Arrays;

public class DriverUpcasting {

    public static void main(String[] args) {

//        test1();
        test2();

        Shape ellipse = new Ellipse("Black", 3, 4);
        Shape shape1 = ellipse.getShape();
        Ellipse ellips = null;
        if (ellipse.getShape() instanceof Ellipse) {
            ellips = (Ellipse) ellipse.getShape();
        }
        Shape ellipsShape = ellips;

    }

    public static void getShape(Shape shape) {
        Shape shape1 = shape.getShape();
    }

    private static void test2() {
        Circle circle = new Circle("Black", 10.0);
        Rectangle rectangle = new Rectangle("Black", 1, 2);

        Shape shape = circle;

        // Shape shape1 = new Shape("Black"); abstract class - cannot instantiate
        //shape1.draw();


        Canvas canvas = new Canvas();
        //canvas.drawShape(shape);
        //canvas.drawShape(rectangle);

        //canvas.drawCircle(circle);

        canvas.draw(shape);


        Arrays.toString(new Circle[2]);


    }


    private static void test1() {

        Manager manager = new Manager("Robert Doe", "987654", 20000.00, "maanger@hr.com");
        System.out.println("****************");
        Department engineering = new Department("Engineering", "6258", manager);
        System.out.println("****************");
        manager.setManagingDepartment(engineering);
        Team team = new Team("Administrative", null, null);
        System.out.println("****************");

        TeamLead teamLead = new TeamLead("John Doe", "123456", 10000.0, engineering, team, "Backend");
        teamLead.manageTeam();

        int a = 5;
        byte b = (byte) a; //down-casting

        Employee employee = new TeamLead("John Doe", "123456", 10000.0, engineering, team, "Backend");
        Employee employee1 = new Manager("Robert Doe", "987654", 20000.00, "maanger@hr.com");

        // TeamLead teamLead1 = new Employee("Test", "123", 1.0); error
        Object employeeObject = new Employee("Test", "123", 1.0);

    }

}
