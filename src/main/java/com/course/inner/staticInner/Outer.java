package com.course.inner.staticInner;

public class Outer {

    private int a;

    public static String value1 = "Outer.value";

    static {
        System.out.println("Outer static block");
    }


    public static class Inner {

        public static String innerValue = "inner";

        static {
            System.out.println("Inner static block");
        }

        void test(){

        }
    }


}
