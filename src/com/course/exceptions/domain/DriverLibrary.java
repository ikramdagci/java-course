package com.course.exceptions.domain;

import com.course.exceptions.ex.CalculationException;
import com.course.exceptions.ex.KmToMConvertException;
import com.course.exceptions.ex.SalaryCalculationException;

public class DriverLibrary {

    public static void main(String[] args) {
        DistanceConverter kmToMConverter = new KmToMConverter();
        try {
            double convert = kmToMConverter.convert(5);
        } catch (CalculationException e) {
            e.printStackTrace();
        }
    }

    public static void calculate(DistanceConverter distanceConverter,double d){
        try {
            System.out.println(distanceConverter.convert(d));
        } catch (CalculationException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    public static void v1(){
        double v = MyLibrary.calculateSalary(12);
        System.out.println(v);
    }
    */



    public static void v2() {
        double v = -1.0;
        try {
            v = MyLibrary.calculateSalary(12);
        } catch (SalaryCalculationException e) {
            e.printStackTrace();
        }
        System.out.println(v);
    }



}
