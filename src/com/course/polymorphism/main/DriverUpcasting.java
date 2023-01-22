package com.course.polymorphism.main;

import com.course.polymorphism.domain.Canvas;
import com.course.polymorphism.domain.Circle;
import com.course.polymorphism.domain.Rectangle;
import com.course.reusability.domain.hr.model.*;

public class DriverUpcasting {

    public static void main(String[] args) {

//        test1();
        test2();

    }

    private static void test2() {
        Circle circle = new Circle("Black",3.0);
        Rectangle rectangle = new Rectangle("Black", 1, 2);


        Canvas canvas = new Canvas();
        canvas.drawShape(circle);
        canvas.drawShape(rectangle);


    }


    private static void test1() {

        Manager manager = new Manager("Robert Doe","987654",20000.00,"maanger@hr.com");
        System.out.println("****************");
        Department engineering = new Department("Engineering","6258",manager);
        System.out.println("****************");
        manager.setManagingDepartment(engineering);
        Team team = new Team("Administrative",null,null);
        System.out.println("****************");

        TeamLead teamLead = new TeamLead("John Doe","123456",10000.0,engineering,team,"Backend");
        teamLead.manageTeam();

        int a = 5;
        byte b = (byte)a; //down-casting

        Employee employee = new TeamLead("John Doe","123456",10000.0,engineering,team,"Backend");
        Employee employee1 =  new Manager("Robert Doe","987654",20000.00,"maanger@hr.com");

        // TeamLead teamLead1 = new Employee("Test", "123", 1.0); error
        Object employeeObject = new Employee("Test", "123", 1.0);

    }

}
