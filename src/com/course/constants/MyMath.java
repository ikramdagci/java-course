package com.course.constants;

public class MyMath {

    public static final double PI; // read-only

    static {
        PI = Math.PI;
    }

    public static int sum(int a,int b){
        return a + b;
    }

    public static int subtract(int a,int b){
        return a - b;
    }

    public static double calculateCircleArea(double r) {
        double area = PI * square(r);
        return area;
    }

    public static double calculateCircumference(double r){
        double result = 2 * PI * r;
        return result;
    }


    public static double square(double x) {
        return x * x;
    }

}
