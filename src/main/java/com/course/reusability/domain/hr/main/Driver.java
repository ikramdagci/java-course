package com.course.reusability.domain.hr.main;

import com.course.reusability.domain.hr.model.Department;
import com.course.reusability.domain.hr.model.Manager;
import com.course.reusability.domain.hr.model.Team;
import com.course.reusability.domain.hr.model.TeamLead;

public class Driver {


    public static void main(String[] args) {

        Manager manager = new Manager("Robert Doe","987654",20000.00,"maanger@hr.com");
        System.out.println("****************");
        Department engineering = new Department("Engineering","6258",manager);
        System.out.println("****************");
        manager.setManagingDepartment(engineering);
        Team team = new Team("Administrative",null,null);
        System.out.println("****************");

        TeamLead teamLead = new TeamLead("John Doe","123456",10000.0,engineering,team,"Backend");



    }

}
