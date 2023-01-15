package com.course.reusability.main;

import com.course.reusability.domain.Circle;
import com.course.reusability.domain.people.Student;
import com.course.reusability.domain.people.Teacher;
import com.course.reusability.domain.school.Classroom;

public class Driver {

    public static void main(String[] args) {

//        test1();
        test2();

    }

    public static void test1() {
        Circle circle = new Circle(3.0, "Black");
        System.out.println(circle.getArea());
        System.out.println(circle.toString());
    }

    public static void test2() {

        Teacher teacher = new Teacher("Robert Doe","1234","Istanbul",'M',"#0000","Math",8562.0);
        Student student = new Student("John Doe","1234","Istanbul",'M',"b1",11,587);
        Student student1 = new Student("Elizabeth Doe","12345","Kocaeli",'F',"b2",11,588);

        //teacher.printInfo();
        //student.printInfo();

        Classroom classroom = new Classroom(teacher,10);
        classroom.addStudent(student);
        classroom.addStudent(student1);
        classroom.printTeacherInfo();
        classroom.printStudentsInfo();

    }

}
