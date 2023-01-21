package com.course.reusability.domain.hr.model;

public class TeamMember extends Employee{

    private Department department;
    private Team team;

    public TeamMember(String fullName, String phoneNumber, double salary,Department department,Team team){
        super(fullName,phoneNumber,salary);
        this.department = department;
        this.team = team;
        System.out.println("TeamMember");
    }


}
