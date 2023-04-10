package com.course.persistence;

import com.course.reusability.domain.hr.model.Manager;

public class Driver {

    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", "538", 5000, "john@company.com");
        System.out.println(manager.toString());

        int x = 2;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                x+=1;
            }
        }

        System.out.println(Integer.MAX_VALUE);
        System.out.println(((int)(Math.pow(10,10) - 1)));

    }

}
