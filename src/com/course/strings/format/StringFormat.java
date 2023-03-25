package com.course.strings.format;

import com.course.collections.domain.Person;

public class StringFormat {

    public static void main(String[] args) {
//        test0();
//        test();
        test1();


    }

    public static void test1(){
//        Regex
        boolean matches = "123".matches("\\d+");
        boolean d = "d".matches("d");
        System.out.println(matches);
        System.out.println(d);
        boolean matches1 = "+".matches("\\+|-");
        System.out.println(matches1);

        boolean matches2 = "A".matches("A?"); // ONE OR NONE
        //boolean matches3 = "B".matches("A*"); // NONE OR MORE ??
        boolean matches4 = "AA".matches("A+"); // ONE OR MORE
        boolean matches5 = "AAAAA".matches("A{5}"); // EXACTLY
        boolean matches6 = "A".matches("A{5,}"); // MINIMUM 5 TIMES
        boolean matches7 = "A".matches("A{5,}"); // MINIMUM 5 TIMES
        boolean matches8 = "A".matches("A{5,10}"); // MINIMUM 5 MAX 10 TIMES
        boolean matches9 = "A".matches("A{0,10}"); //  MAX 10 TIMES

        String regex = "[a-z]{3,30}@[a-z]{3,20}.com";


        System.out.println(matches2);
        // email validation?
        System.out.println("example_test@gmail.com".matches(regex));

    }

    public static void test(){
        //"System.out.printf("%-5s","ABC");
//        System.out.printf("%-5s%5S","ABC","TEST");
        System.out.println(5.0/3.0);
        System.out.printf("%3.2f\n",5.0/3.0);

        System.out.printf("%06d\n",25);

        String format = String.format("%06d", 25);
        String format2 = String.format("%3.2f\n",5.0/3.0);
        System.out.println(format);
        System.out.println(format2);

    }

    public static void test0(){
        //        String i = String.valueOf(5);
//        String.format();
        String format = "Hi, my name is %s %s\n";
        System.out.printf(format,"John","Doe");
        System.out.printf(format,"Robert","Doe");

        /*
         %[argument_index$][flags][.precision] conversion
         d, decimal
         s, string
         b, boolean
         f, floating point numbers
         x, hexadecimal
         c, char
         e, scientific notification
        */

        String exceptionMessageFormat = "%s exception, line : %d\n";
        System.out.printf(exceptionMessageFormat,"IOException",5);

        String exceptionMessageFormat1 = "%2$s exception, line : %1$d\n";

        System.out.printf(exceptionMessageFormat1,0,"ArithmeticException");


        System.out.printf("%5s","A");

    }

}
