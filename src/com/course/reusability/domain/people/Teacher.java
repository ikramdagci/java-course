package com.course.reusability.domain.people;

public class Teacher extends Person{

    private String registrationNumber;
    private String branch;
    private double salary;

    public Teacher(String fullName, String tckn, String address, char gender, String registrationNumber, String branch, double salary) {
        super(fullName, tckn, address, gender);
        this.registrationNumber = registrationNumber;
        this.branch = branch;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Full Name : "+ fullName + ", Gender : " + gender + ", Address : " + address +  ", registrationNumber : " + registrationNumber + ", salary : " + salary);
    }

}
