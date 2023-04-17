package com.course.inner.staticInner;

public class Driver {

    public static void main(String[] args) {

        String value = Outer.value1;
        System.out.println(value);
        String innerValue = Outer.Inner.innerValue;

        Outer.Inner inner = new Outer.Inner();



    }

}
