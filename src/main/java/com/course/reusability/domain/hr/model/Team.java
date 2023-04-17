package com.course.reusability.domain.hr.model;

public class Team {

    private String name;
    private TeamLead teamLead;

    private TeamMember[] teamMembers;

    public Team(String name, TeamLead teamLead, TeamMember[] teamMembers) {
        this.name = name;
        this.teamLead = teamLead;
        this.teamMembers = teamMembers;
        System.out.println("Team");
    }
}
