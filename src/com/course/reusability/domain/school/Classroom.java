package com.course.reusability.domain.school;

import com.course.reusability.domain.people.Student;
import com.course.reusability.domain.people.Teacher;

import java.util.Arrays;

public class Classroom {

    // composition
    // one-to-one
    private Teacher teacher;
    private Student[] students;
    private int capacity;
    private int index;


    public Classroom(Teacher teacher, int capacity) {
        this.teacher = teacher;
        this.capacity = capacity;
        this.index = 0;
        this.students = new Student[capacity];
    }

    public void addStudent(Student newStudent) {
        ensureCapacity();
        students[index++] = newStudent;
    }

    public void deleteStudent(int index) {
        this.students[index] = null;
    }

    private void ensureCapacity() {
        System.out.println("Checking capacity: index = " + index + "; capacity= " + capacity);
        if (index >= capacity) {
            int newCapacity = capacity + (capacity >> 1);
            System.out.println("Capacity is growing: new capacity: " + newCapacity);
            grow(newCapacity);
        }

    }

    private void grow(int newCapacity) {
        Student[] students1 = new Student[newCapacity];
        System.out.println("New larger array created with capacity: " + newCapacity);
        System.out.println(Arrays.toString(students1));

        for (int i = 0; i < students.length; i++) {
            students1[i] = students[i];
        }
        System.out.println(Arrays.toString(students1));
        this.students = students1;
        this.capacity = newCapacity;
    }

    public void printTeacherInfo() {
        System.out.println("Printing teachers info...");
        teacher.printInfo();
    }

    public void printStudentsInfo() {
        System.out.println("Printing students info...");
        for (int i = 0; i < index; i++) {
            Student student = students[i];
            if (student != null) {
                student.printInfo();
            }

        }

    }

}
