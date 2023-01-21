package com.course.reusability.domain.hr.model;

public class Manager extends Employee {

    private String email;
    private Department managingDepartment;

    public Manager(String fullName, String phoneNumber, double salary,String email) {
        super(fullName, phoneNumber, salary);
        this.email = email;
        System.out.println("Manager");
    }

    public void manage(){
        System.out.println("Manager managing.....");
    }


    public void setManagingDepartment(Department managingDepartment) {
        this.managingDepartment = managingDepartment;
    }
}
