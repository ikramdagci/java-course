package com.course.reusability.domain.hr.model;

public class TeamLead extends Engineer {
    public TeamLead(String fullName, String phoneNumber, double salary, Department department, Team team, String branch) {
        super(fullName, phoneNumber, salary, department, team, branch);
        System.out.println("TeamLead");
    }
}
