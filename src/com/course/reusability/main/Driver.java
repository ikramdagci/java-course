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

        Teacher teacher = new Teacher("Robert Doe", "1234", "Istanbul", 'M', "#0000", "Math", 8562.0);
        Student student = new Student("John Doe", "1234", "Istanbul", 'M', 11, 587);
        Student student1 = new Student("Elizabeth Doe", "12345", "Kocaeli", 'F', 12, 23);
        Student student2 = new Student("Yunus Emre Çiftçi", "12345", "Kocaeli", 'M', 13, 54);
        Student student3 = new Student("Abdülkadir Kılınç", "12345", "Kocaeli", 'M', 14, 345);
        Student student4 = new Student("Recep Çınar", "12345", "Sakarya", 'M', 15, 54);
        Student student5 = new Student("İkram Dağcı", "12345", "Kocaeli", 'M', 16, 98);
        Student student6 = new Student("Oğuzhan Türk", "12345", "Kocaeli", 'M', 17, 124);
        Student student7 = new Student("Yasin Özaydın", "12345", "Kocaeli", 'M', 18, 45);
        Student student8 = new Student("Hacı Karataş", "12345", "Kocaeli", 'M', 19, 87);
        Student student9 = new Student("Seda Yılmaz", "12345", "Kocaeli", 'F', 20, 212);

        //teacher.printInfo();
        //student.printInfo();

        Classroom classroom = new Classroom(teacher, 10);
        for (int i = 0; i < 10; i++) {
            classroom.addStudent(student5);
        }
        classroom.deleteStudent(2);
        classroom.deleteStudent(3);
        classroom.deleteStudent(4);
        classroom.deleteStudent(5);
        classroom.addStudent(student);
        classroom.printTeacherInfo();
        classroom.printStudentsInfo();
        // 0'dan düşük indeks numarası, silinen öğrencilerin yerine yeni öğrencileri silinen öğrencilerin index numarasına sırayla atama.
    }

}
