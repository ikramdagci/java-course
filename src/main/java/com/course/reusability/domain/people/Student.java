package com.course.reusability.domain.people;

public class Student extends Person {

    private int no;
    private int grade;
    private int lockerNo;

    private static int counter = 1;



    public Student(String fullName, String tckn, String address, char gender, int grade, int lockerNo) {
        super(fullName, tckn, address, gender);
        this.no = counter++;
        this.grade = grade;
        this.lockerNo = lockerNo;
    }

    public int getNo() {
        return no;
    }

    public void printInfo() {
        System.out.println("Full Name : "+ fullName + ", Gender : " + gender + ", Address : " + address +  ", No : " + no + ", Grade : " + grade);
    }
}
