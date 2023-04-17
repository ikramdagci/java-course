package com.course.abstraction.util;

public class AreaUtil {


    public static double calculateEllipseArea(double a,double b){
        return Math.PI * a * b;
    }

    public static double calculateCircleArea(double r){
        return AreaUtil.calculateEllipseArea(r,r);
    }

}
