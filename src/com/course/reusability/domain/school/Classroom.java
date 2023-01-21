package com.course.reusability.domain.school;

import com.course.reusability.domain.people.Student;
import com.course.reusability.domain.people.Teacher;

public class Classroom {

    // composition
    // one-to-one
    private Teacher teacher;
    private Student[] students;
    private int capacity;
    private int index;

    /*
    1 null 3 4 5
    //1 null 3 4 5 6
    1,3,4,5,null , index--
    1,3,4,5,6
    */

    public Classroom(Teacher teacher, int capacity) {
        this.teacher = teacher;
        this.capacity = capacity;
        this.index = 0;
        this.students = new Student[capacity];
    }

    public void addStudent(Student newStudent) {
        if (index < capacity) {
            students[index++] = newStudent;
        } else {
            System.out.println("Error, capacity is full");
        }
    }

    public void printTeacherInfo(){
        System.out.println("Printing teachers info...");
        teacher.printInfo();
    }

    public void printStudentsInfo(){
        System.out.println("Printing students info...");
        for (int i = 0; i < index; i++) {
            Student student = students[i];
            student.printInfo();
        }

    }

}
