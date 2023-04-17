package com.course.exceptions.domain;

import com.course.exceptions.ex.MyCustomException;
import com.course.exceptions.ex.SalaryCalculationException;

import java.util.Random;

public class MyLibrary {

    public static int /*catch (Exception e) {
        } */f(int a,int b) throws MyCustomException{
        if(b == 0) {
            throw new MyCustomException("Something went wrong");
        } else {
            return a / b;
        }
    }

    public static double calculateSalary(int employeeId) throws SalaryCalculationException {
            // finds employee and calculates salary
        if(employeeId < 0) {
            throw new SalaryCalculationException();
        }
        Random random = new Random();
        double d = random.nextDouble() * employeeId * 1000;
        return d;
    }

}
