package com.course.reusability.domain.hr.model;

public class Analyst extends TeamMember{

    private Customer customer;

    public Analyst(String fullName, String phoneNumber, double salary, Department department, Team team,Customer customer) {
        super(fullName, phoneNumber, salary, department, team);
        this.customer = customer;
        System.out.println("Analyst");
    }
}
