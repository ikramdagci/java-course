package com.course.reusability.domain.people;

public class Student extends Person {

    private String no;
    private int grade;
    private int lockerNo;

    public Student(String fullName, String tckn, String address, char gender, String no, int grade, int lockerNo) {
        super(fullName, tckn, address, gender);
        this.no = no;
        this.grade = grade;
        this.lockerNo = lockerNo;
    }




    public void printInfo() {
        System.out.println("Full Name : "+ fullName + ", Gender : " + gender + ", Address : " + address +  ", No : " + no + ", Grade : " + grade);
    }

    public void test0(){
        test1(this);
        //test2(super); compile error
    }

    public void test1(Student student){
        student.printInfo();
    }

    public void test2(Person person){
        person.printInfo();
    }
}
