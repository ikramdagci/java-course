package com.course.reusability.domain.hr.model;

public class Engineer extends TeamMember {

    private String branch;

    public Engineer(String fullName, String phoneNumber, double salary, Department department, Team team,String branch) {
        super(fullName, phoneNumber, salary, department, team);
        this.branch = branch;
        System.out.println("Engineer");
    }
}
