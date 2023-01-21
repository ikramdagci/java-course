package com.course.reusability.domain.hr.model;

public class Department {

    private String name;
    private String internalPhoneNumber;
    private Manager manager;

    public Department(String name, String internalPhoneNumber, Manager manager) {
        this.name = name;
        this.internalPhoneNumber = internalPhoneNumber;
        this.manager = manager;
        System.out.println("Department");
    }
}
