package com.course.reusability.domain.hr.model;

public class Employee {



    protected String fullName;
    private String phoneNumber;
    private double salary;

    Department department;




    public Employee(String fullName, String phoneNumber, double salary) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        System.out.println("Employee");
    }

    public void work(){
        System.out.println("Employee is working...");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                '}';
    }
}
