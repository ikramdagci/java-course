package com.course.polymorphism.domain.fields;

public class Driver {

    public static void main(String[] args) {
        A b = new B();

        System.out.println(b.value);

        B b1 = (B) b;
        b1.somethingBSpecial();

        System.out.println(b.getValue());

        //C c = (C) b;

    }

}
